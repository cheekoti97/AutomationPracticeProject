package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;
	public HomePage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//a[span[text()='My Account']]")
	private WebElement MyAccountDropMenu;
	
public void clickOnMyAccount()
{
	MyAccountDropMenu.click();
	
	}
@FindBy(linkText="Register")
 private WebElement RegisterOption;

public RegisterAccountPage clickOnRegister()
{
	RegisterOption.click();
	return new RegisterAccountPage(driver);
	}

@FindBy(linkText="Login")
private WebElement LoginOption;
public LoginPage selectLoginOption() {
	LoginOption.click();
	return new LoginPage(driver);
}
}