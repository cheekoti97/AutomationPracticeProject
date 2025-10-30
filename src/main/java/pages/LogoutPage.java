package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogoutPage {
    WebDriver driver;
    
    public LogoutPage(WebDriver driver) {
    	this.driver=driver;
    	PageFactory.initElements(driver, this);
	
}
    @FindBy(xpath="//div[@id='common-success']//h1")
    private WebElement accountLogOutText;
    public boolean accountLogOutDisplayed()
    {
    	return accountLogOutText.isDisplayed();
    }
}
