package genericLibrary;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

import pomRepository.HomePage;
import pomRepository.LoginPage;
/**
 * 
 * @author Pavithra
 *
 */
public class BaseTest {
  public static WebDriver driver;
	@BeforeClass
	/**
	 * This method is used to perform precondition actions on the application
	 */
	public void preCondition() {
		System.setProperty(IAutoConstants.CHROME_KEY, IAutoConstants.CHROME_VALUE);
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	@BeforeMethod
	/**
	 * This method is used to perform login actions on the application
	 */
	public void loginCredentials() {
		driver.get(IAutoConstants.URL);
		LoginPage loginPage=new LoginPage(driver);
		loginPage.getUsernameTextField().clear();
		loginPage.getUsernameTextField().sendKeys(IAutoConstants.USER_NAME);
		loginPage.getPasswordnameTextField().clear();
		loginPage.getPasswordnameTextField().sendKeys(IAutoConstants.PASSWORD,Keys.ENTER);
		HomePage homepage=new HomePage(driver);
		WebDriverWait wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(homepage.getLeadsLink()));
		homepage.getLeadsLink().click();
	}
	@AfterMethod
	/**
	 * This method is used to perform logout actions on the application
	 */
	public void signout() {
		HomePage homePage=new HomePage(driver);
		homePage.getSignOutImage().click();
		homePage.getSignOut().click();
	}
	@AfterClass
	/**
	 * This method is used to perform postcondition actions on the application
	 */
	public void logout() {
				driver.quit();
	}
}
