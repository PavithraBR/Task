package testScripts;

import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import pomRepository.LeadsPage;

public class TC_03 extends BaseTest {

	@Test
	public void CreateNewLead() {
		LeadsPage lead=new LeadsPage(driver);
		lead.getLeadsIcon().click();
		lead.getFirstNameTextField().sendKeys("Pavithra");
		lead.getLastnameTextField().sendKeys("BR");
		lead.getCompanynameTextField().sendKeys("TY");
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
		String expectedTitle="Administrator - Leads - vtiger CRM 5 - Commercial Open Source CRM";
		if(expectedTitle.equalsIgnoreCase(driver.getTitle())) {
			System.out.println("new lead is created and unique lead no is generated");
		} else {
			System.err.println("new lead is not created");
		}
		
	}
}
