package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//div[@id='content']//h2")
	WebElement textNewCostomer;
	public boolean textNewCostomerDisplayed() {
		return textNewCostomer.isDisplayed();
	}
	@FindBy(linkText="Continue")
	private WebElement clickContinue;
	public  RegisterAccountPage clickContinueButton()
	{
		clickContinue.click();
		return new  RegisterAccountPage(driver);
	}

}
