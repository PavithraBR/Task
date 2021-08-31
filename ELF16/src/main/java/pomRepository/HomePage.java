package pomRepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
		}

	@FindBy(xpath="//a[text()='Leads']") private WebElement leadsLink;
	public WebElement getLeadsLink() {
		return leadsLink;
	}

	@FindBy(xpath="//img[@src='themes/softed/images/user.PNG']") private WebElement SignOutImage;
	
	
	public WebElement getSignOutImage() {
		return SignOutImage;
	}

	@FindBy(xpath="//a[text()='Sign Out']") private WebElement signOut;
	public WebElement getSignOut() {
		return signOut;
	}

	 
	
}
