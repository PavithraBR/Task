package pomRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LeadsPage {
	public LeadsPage(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	
@FindBy(xpath="//img[@alt='Create Lead...']") private WebElement leadsIcon;
	
	public WebElement getLeadsIcon() {
		return leadsIcon;
	}
	@FindBy(name="firstname") private WebElement firstNameTextField;
	@FindBy(name="lastname") private WebElement lastnameTextField;
	@FindBy(name="company") private WebElement companynameTextField;
	@FindBy(name="designation") private WebElement designationTextField;
	@FindBy(name="annualrevenue") private WebElement annualIncomeTextField;
	@FindBy(id="noofemployees") private WebElement noOfEmployeesTextField;
	@FindBy(id="secondaryemail") private WebElement secondaryEmailTextField;
	@FindBy(id="phone") private WebElement phoneTextField;
	@FindBy(id="mobile") private WebElement mobileTextFeld;
	@FindBy(id="fax") private WebElement faxTextField;
	@FindBy(name="email") private WebElement emailTextField;
	
	@FindBy(name="website") private WebElement websiteTextField;
	@FindBy(name="lane") private WebElement laneTextField;
	@FindBy(id="code") private WebElement codeTextField;
	@FindBy(id="country") private WebElement countryTextField;
	@FindBy(id="pobox") private WebElement poboxTextField;
	@FindBy(id="city") private WebElement cityTextField;
	@FindBy(id="state") private WebElement stateTextField;
	@FindBy(name="description") private WebElement descriptionTextField;
	@FindBy(name="button") private WebElement button;
	
	public WebElement getFirstNameTextField() {
		return firstNameTextField;
	}
	public WebElement getLastnameTextField() {
		return lastnameTextField;
	}
	public WebElement getCompanynameTextField() {
		return companynameTextField;
	}
	public WebElement getDesignationTextField() {
		return designationTextField;
	}
	public WebElement getAnnualIncomeTextField() {
		return annualIncomeTextField;
	}
	public WebElement getNoOfEmployeesTextField() {
		return noOfEmployeesTextField;
	}
	public WebElement getSecondaryEmailTextField() {
		return secondaryEmailTextField;
	}
	public WebElement getPhoneTextField() {
		return phoneTextField;
	}
	public WebElement getMobileTextFeld() {
		return mobileTextFeld;
	}
	public WebElement getFaxTextField() {
		return faxTextField;
	}
	public WebElement getEmailTextField() {
		return emailTextField;
	}
	public WebElement getWebsiteTextField() {
		return websiteTextField;
	}
	public WebElement getLaneTextField() {
		return laneTextField;
	}
	public WebElement getCodeTextField() {
		return codeTextField;
	}
	public WebElement getCountryTextField() {
		return countryTextField;
	}
	public WebElement getPoboxTextField() {
		return poboxTextField;
	}
	public WebElement getCityTextField() {
		return cityTextField;
	}
	public WebElement getStateTextField() {
		return stateTextField;
	}
	public WebElement getDescriptionTextField() {
		return descriptionTextField;
	}
	public WebElement getButton() {
		return button;
	}
}
