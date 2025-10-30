package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountSuccessPage {

	WebDriver driver;
	public AccountSuccessPage(	WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	@FindBy(xpath="//div[@id='common-success']//h1")
	  private WebElement checkAssert1;
	
	 public boolean checkDisplayed1() {
		return checkAssert1.isDisplayed();
	}
	@FindBy(linkText="Continue")
	private  WebElement checkAssert2;
	
	public boolean checkDisplayed2() {
		return checkAssert2.isDisplayed();
	}
	@FindBy(linkText="Continue")
	 private WebElement successPageContinue;
	public void  successPageClickContinue() {
		successPageContinue.click();
	}
	@FindBy(linkText="Subscribe / unsubscribe to newsletter")
	private WebElement checkSubcription;
	public boolean checkSubscriptionDisplayed() {
	 return checkSubcription.isDisplayed();
	}
	@FindBy(linkText="Logout")
	private WebElement successPageLogoutVisible;
	public boolean successPageLougoutDisplayed() {
		return successPageLogoutVisible.isDisplayed();
	}
	@FindBy(linkText="Logout")
	private WebElement successPageLogout;
	public LogoutPage successPageLogOutClick() {
		successPageLogout.click();
		return new  LogoutPage(driver);
	}
 }
