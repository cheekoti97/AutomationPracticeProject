package practice.testcases;


import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.Base;
import pages.AccountSuccessPage;
import pages.HomePage;
import pages.LogoutPage;
import pages.RegisterAccountPage;
import utils.CommonUtils;


public class TC_RF_001 extends Base {
	WebDriver driver;
	Properties prop;
	HomePage homePage;
    RegisterAccountPage RegisterAccountPage;
    AccountSuccessPage accountSuccessPage;
    LogoutPage logoutPage;
	
	@BeforeMethod
	public void LoadBrowse() {
		driver = openBrowserAndApplication();
        prop = CommonUtils.LoadProperties();
        homePage=new HomePage(driver);
        homePage.clickOnMyAccount();
        RegisterAccountPage = homePage.clickOnRegister();
       
		
	}
	@AfterMethod
	public void TearDown() {
		driver.quit();
	}


	
    @Test(priority=1)
	public  void VerfyRegistrationIsSucess() throws InterruptedException {
    	RegisterAccountPage.enterFirstName(prop.getProperty("firstName"));
		Thread.sleep(2000);
		RegisterAccountPage.enterLastName(prop.getProperty("lastName"));
		RegisterAccountPage.enterEmailId(CommonUtils.AutoEmailUpdate());
		RegisterAccountPage.enterPhoneNumber(prop.getProperty("mobileNo"));
		Thread.sleep(2000);
		//driver.findElement(By.id("input-telephone")).sendKeys(prop.getProperty("mobileNo"));
		RegisterAccountPage.enterPassword(prop.getProperty("password"));
		Thread.sleep(2000);
		//driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("password"));
		RegisterAccountPage.enterConfirmPassword(prop.getProperty("confirmPassword"));
		Thread.sleep(2000);
		//driver.findElement(By.id("input-confirm")).sendKeys(prop.getProperty("confirmPassword"));
		RegisterAccountPage.radioButtonSelect();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@name='newsletter'][@value='1']")).click();
		RegisterAccountPage.selectPolicy();
		Thread.sleep(2000);
		//driver.findElement(By.name("agree")).click();
	    accountSuccessPage = RegisterAccountPage.clickContinue();
		Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@value='Continue']")).click();
		//Assert.assertTrue(RegisterAccountPage.checkDisplayed());
		accountSuccessPage.checkDisplayed1();
		
		//System.out.println(RegisterAccountPage.checkDisplayed());
		Thread.sleep(2000);
		//Assert.assertTrue(driver.findElement(By.xpath("//div[@id='common-success']//h1")).isDisplayed());
		accountSuccessPage.checkDisplayed2();
		
		Thread.sleep(2000);
		//Assert.assertTrue(driver.findElement(By.linkText("Continue")).isDisplayed());
	
		
    }
	
    @Test(priority=2)
    public  void VerfyRegistrationIsSucess1() throws InterruptedException
    {
    	RegisterAccountPage.enterFirstName(prop.getProperty("firstName"));
		//driver.findElement(By.id("input-firstname")).sendKeys(prop.getProperty("firstName"));
    	RegisterAccountPage.enterLastName(prop.getProperty("lastName"));
		//driver.findElement(By.id("input-lastname")).sendKeys(prop.getProperty("lastName"));
    	RegisterAccountPage.enterEmailId(CommonUtils.AutoEmailUpdate());
		//driver.findElement(By.id("input-email")).sendKeys(CommonUtils.AutoEmailUpdate());
    	RegisterAccountPage.enterPhoneNumber(prop.getProperty("mobileNo"));
		//driver.findElement(By.id("input-telephone")).sendKeys(prop.getProperty("mobileNo"));
    	RegisterAccountPage.enterPassword(prop.getProperty("password"));
		//driver.findElement(By.id("input-password")).sendKeys(prop.getProperty("password"));
    	RegisterAccountPage.enterConfirmPassword(prop.getProperty("confirmPassword"));
		//driver.findElement(By.id("input-confirm")).sendKeys(prop.getProperty("confirmPassword"));
    	RegisterAccountPage.radioButtonSelect();
		//driver.findElement(By.xpath("//input[@name='newsletter'][@value='1']")).click();
		RegisterAccountPage.selectPolicy();
		//driver.findElement(By.name("agree")).click();
		accountSuccessPage = RegisterAccountPage.clickContinue();
	    //driver.findElement(By.xpath("//input[@value='Continue']")).click();
		Thread.sleep(3000);
		accountSuccessPage.successPageClickContinue();
		//driver.findElement(By.linkText("Continue")).click();
		Thread.sleep(3000);
		accountSuccessPage.checkSubscriptionDisplayed();
		//Assert.assertTrue(driver.findElement(By.linkText("Subscribe / unsubscribe to newsletter")).isDisplayed());
		accountSuccessPage.successPageLougoutDisplayed();
		Thread.sleep(5000);
		//Assert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
		logoutPage=accountSuccessPage.successPageLogOutClick();
		//driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(5000);
		logoutPage.accountLogOutDisplayed();
		//Assert.assertTrue(driver.findElement(By.xpath("//div[@id='common-success']//h1")).isDisplayed());
		
    	
    }
   @Test(priority=3)
    public void VerifyUsingKeyboard()
    {
    	Actions act=new Actions(driver);
    	//for(int i=1;i<=3;i++) {
    	//act.sendKeys(Keys.TAB).perform();
    	//}
    	//act.sendKeys(Keys.ENTER).pause(Duration.ofSeconds(3)).sendKeys(Keys.TAB).pause(Duration.ofSeconds(3)).sendKeys(Keys.ENTER).pause(Duration.ofSeconds(3)).build().perform();
    	for(int i=1;i<=23;i++) {
    		act.sendKeys(Keys.TAB).perform();
    	}
    	act.sendKeys(prop.getProperty("firstName")).pause(Duration.ofSeconds(3))
    	.sendKeys(Keys.TAB).pause(Duration.ofSeconds(3))
    	.sendKeys(prop.getProperty("lastName")).pause(Duration.ofSeconds(3))
    	.sendKeys(Keys.TAB).pause(Duration.ofSeconds(3))
    	.sendKeys(CommonUtils.AutoEmailUpdate()).pause(Duration.ofSeconds(3))
    	.sendKeys(Keys.TAB).pause(Duration.ofSeconds(3))
    	.sendKeys(prop.getProperty("mobileNo")).pause(Duration.ofSeconds(3))
    	.sendKeys(Keys.TAB).pause(Duration.ofSeconds(3))
    	.sendKeys(prop.getProperty("password")).pause(Duration.ofSeconds(3))
    	.sendKeys(Keys.TAB).pause(Duration.ofSeconds(3))
    	.sendKeys(prop.getProperty("confirmPassword")).pause(Duration.ofSeconds(3))
    	.sendKeys(Keys.TAB).pause(Duration.ofSeconds(3))
    	.sendKeys(Keys.LEFT).pause(Duration.ofSeconds(3))
    	.sendKeys(Keys.TAB).sendKeys(Keys.TAB)
    	.sendKeys(Keys.SPACE).pause(Duration.ofSeconds(3))
    	.sendKeys(Keys.TAB).pause(Duration.ofSeconds(3))
    	.sendKeys(Keys.ENTER)
    	.build().perform();
    }
    
    
    
    
    
    
    
    

}


