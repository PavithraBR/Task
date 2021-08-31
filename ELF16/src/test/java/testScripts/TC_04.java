package testScripts;

import org.testng.annotations.Test;

import pomRepository.LeadsPage;
import genericLibrary.BaseTest;

public class TC_04 extends BaseTest {
	@Test
	public void CreateNewLead() {
		LeadsPage lead=new LeadsPage(driver);
		lead.getLeadsIcon().click();
		lead.getButton().click();
		driver.switchTo().alert().accept();
		String expectedUrl="http://localhost:8888/index.php?module=Leads&action=EditView&return_action=DetailView&parenttab=Marketing";
		if(expectedUrl.equalsIgnoreCase(driver.getCurrentUrl())) {
			System.out.println("Last Name cannot be empty message is displaying");
		} else {
			System.err.println("last name connot be empty message is not displayed");
		}
	}


}
