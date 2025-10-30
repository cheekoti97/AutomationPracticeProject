package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterAccountPage {
WebDriver driver;
public RegisterAccountPage(WebDriver driver) {
	
	this.driver=driver;
	PageFactory.initElements(driver,this );
}
@FindBy (id="input-firstname")
private WebElement firstNameField;

public void enterFirstName(String firstNameText) {
	firstNameField.sendKeys(firstNameText);
}
@FindBy(id="input-lastname")
 private WebElement lastNameField;

public void enterLastName(String lastNameText) {
	lastNameField.sendKeys(lastNameText);
}
@FindBy(id="input-email")
  private WebElement emailId;
public void enterEmailId(String emailIdText) {
	emailId.sendKeys(emailIdText);
}
@FindBy(id="input-telephone")
private WebElement phoneNumber;
public void enterPhoneNumber(String phoneNo) {
	phoneNumber.sendKeys(phoneNo);
}
@FindBy(id="input-password")
private WebElement password;
public void enterPassword(String password1) {
	password.sendKeys(password1);
}
@FindBy(id="input-confirm")
private WebElement confirmPassword;
public void enterConfirmPassword(String password2) {
	confirmPassword.sendKeys(password2);
}
@FindBy(xpath="//input[@name='newsletter'][@value='1']")
private WebElement selectYes;
public void radioButtonSelect() {
	selectYes.click();
}
@FindBy(name="agree")
private WebElement privacyPolicy;
public void selectPolicy() {
	privacyPolicy.click();
}
@FindBy(xpath="//input[@value='Continue']")
private WebElement enterContinue;
public AccountSuccessPage  clickContinue() {
	enterContinue.click();
	return new AccountSuccessPage(driver);
	
}

}
