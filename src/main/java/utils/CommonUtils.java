package utils;

import java.io.FileReader;
import java.util.Date;
import java.io.IOException;

import java.util.Properties;

public class CommonUtils {
	public  static Properties LoadProperties() {
		Properties prop = new Properties();
		try {
		FileReader fr= new FileReader(System.getProperty("user.dir")+"\\src\\test\\resources\\projectdata.properties");
	    prop.load(fr);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return prop;
	}//C:\Users\cheek\eclipse-workspace\AutomationPracticeProject\src\test\resources\projectdata.properties
	
	public static String AutoEmailUpdate() {
		Date date=new Date();
		String dateString=date.toString();
		String dateStringWithOutSpaces=dateString.replaceAll("\\s","");
		String dateStringWithoutSpacesAndColons=dateStringWithOutSpaces.replaceAll("\\:", "");
		String newEmailId=dateStringWithoutSpacesAndColons+"@email.com";
		return newEmailId;
		
		//return new Date().toString().replaceAll("\\s","").replaceAll("\\:", "")+"@email.com";
	}

}

