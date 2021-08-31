package testScripts;

import org.testng.Assert;
import org.testng.annotations.Test;
import pomRepository.LeadsPage;
import genericLibrary.BaseTest;


public class TC_05 extends BaseTest {
	
	@Test
	public void CreateNewLead() throws InterruptedException {
		
		LeadsPage lead=new LeadsPage(driver);
		lead.getLeadsIcon().click();
		lead.getFirstNameTextField().sendKeys("Pavithra");
		lead.getDesignationTextField().sendKeys("Software Engineer");
		lead.getAnnualIncomeTextField().sendKeys("50000");
		lead.getNoOfEmployeesTextField().sendKeys("500");
		lead.getSecondaryEmailTextField().sendKeys("pavithrabr048@gmail.com");
		lead.getPhoneTextField().sendKeys("7090809477");
		lead.getMobileTextFeld().sendKeys("8073266636");
		lead.getFaxTextField().sendKeys("12345");
		lead.getEmailTextField().sendKeys("pavithrabr048@gmail.com");
		lead.getWebsiteTextField().sendKeys("www.facebook.com");
		lead.getLaneTextField().sendKeys("Dargajogihalli");
		lead.getCodeTextField().sendKeys("561203");
		lead.getCountryTextField().sendKeys("INDIA");
		lead.getPoboxTextField().sendKeys("1234");
		lead.getCityTextField().sendKeys("Banglore");
		lead.getStateTextField().sendKeys("Karnataka");
		lead.getDescriptionTextField().sendKeys("creating a new lead");
		lead.getButton().click();
		driver.switchTo().alert().accept();
		String expectedUrl="http://localhost:8888/index.php?module=Leads&action=EditView&return_action=DetailView&parenttab=Marketing";
		if(expectedUrl.equalsIgnoreCase(driver.getCurrentUrl())) {
			System.out.println("Last Name cannot be empty message is displaying");
		} else {
			System.err.println("last name connot be empty message is not displayed");
		}
		
		Assert.assertEquals(null, expectedUrl,"");
				
	}

	

}
