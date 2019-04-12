package mercury.utility;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

import mercury.pages.RegisterPage;

public class SeleniumUtil {
	static Logger log = Logger.getLogger(RegisterPage.class);
	public static void senkeys(WebElement element,String value,String elementName,ExtentTest test) {
		
		element.sendKeys(value);
		test.log(Status.INFO,"Value Entered in "+elementName+" successfully");
		log.info("Value Entered in "+elementName+" successfully");
	}

	//click
	//dropdown
	
}
