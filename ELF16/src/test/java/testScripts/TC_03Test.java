package testScripts;

import org.testng.annotations.Test;

import genericLibrary.BaseTest;
import genericLibrary.ExcelUtil;
import pomRepository.LeadsPage;

public class TC_03Test extends BaseTest {

	@Test
	public void CreateNewLead() throws Exception {
		LeadsPage lead=new LeadsPage(driver);
		lead.getLeadsIcon().click();
		ExcelUtil data=new ExcelUtil();
		lead.getFirstNameTextField().sendKeys(data.excelStringFile("Sheet1", 0, 0));
		lead.getLastnameTextField().sendKeys(data.excelStringFile("Sheet1", 1,0));
		lead.getCompanynameTextField().sendKeys(data.excelStringFile("Sheet1", 2,0));
		lead.getDesignationTextField().sendKeys(data.excelStringFile("Sheet1", 3,0));
		
		lead.getAnnualIncomeTextField().clear();
		lead.getAnnualIncomeTextField().sendKeys(""+data.excelNumericFile("Sheet1", 4,0));
		lead.getNoOfEmployeesTextField().sendKeys(""+data.excelNumericFile("Sheet1", 5,0));
		lead.getSecondaryEmailTextField().sendKeys(data.excelStringFile("Sheet1", 6,0));
		lead.getPhoneTextField().sendKeys(""+data.excelNumericFile("Sheet1", 7,0));
		lead.getMobileTextFeld().sendKeys(""+data.excelNumericFile("Sheet1", 8,0));
		lead.getFaxTextField().sendKeys(""+data.excelNumericFile("Sheet1", 9,0));
		lead.getEmailTextField().sendKeys(data.excelStringFile("Sheet1", 10,0));
		lead.getWebsiteTextField().sendKeys(data.excelStringFile("Sheet1", 11,0));
		lead.getLaneTextField().sendKeys(data.excelStringFile("Sheet1", 12,0));
		lead.getCodeTextField().sendKeys(data.excelStringFile("Sheet1", 13,0));
		lead.getCountryTextField().sendKeys(data.excelStringFile("Sheet1", 14,0));
		lead.getPoboxTextField().sendKeys(""+data.excelNumericFile("Sheet1", 15,0));
		lead.getCityTextField().sendKeys(data.excelStringFile("Sheet1", 16,0));
		lead.getStateTextField().sendKeys(data.excelStringFile("Sheet1", 17,0));
		lead.getDescriptionTextField().sendKeys(data.excelStringFile("Sheet1", 18,0));
		lead.getButton().click();
		Thread.sleep(2000);
		String expectedTitle="Administrator - Leads - vtiger CRM 5 - Commercial Open Source CRM";
		if(expectedTitle.equalsIgnoreCase(driver.getTitle())) {
			System.out.println("new lead is created and unique lead no is generated");
		} else {
			System.err.println("new lead is not created");
		}
	}
}
