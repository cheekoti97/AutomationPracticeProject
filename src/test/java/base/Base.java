package base;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utils.CommonUtils;

public class Base {

    WebDriver driver;
   
	   public WebDriver openBrowserAndApplication() {
		  // ChromeOptions options=new ChromeOptions();
		   //options.setBinary("C:\\Users\\cheek\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe") ;
	   Properties prop = CommonUtils.LoadProperties();	
	   String browserName=prop.getProperty("browserName");
	   if(browserName.equals("chrome")){
	   driver=new ChromeDriver();	
			}
    else if(browserName.equals("firefox")) {
	   driver=new FirefoxDriver();
				
			}
    else if(browserName.equals("edge"))
    {
    	driver=new EdgeDriver();
    }
	   driver.manage().window().maximize();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	   
	   driver.get(prop.getProperty("appUrl"));
		
		return driver;
		}

	}


