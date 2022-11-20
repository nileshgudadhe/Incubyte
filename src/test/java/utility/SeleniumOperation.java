package utility;

import java.util.Hashtable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumOperation {
	
	public static WebDriver driver=null;
	public static Hashtable<String, Object> outputParameters=new Hashtable<String, Object>();
	
	public static Hashtable<String, Object> bLaunch(Object[]inputParameters){
		try
		{
		String bname=(String)inputParameters[0];
		String exe=(String)inputParameters[1];
		
		if(bname.equalsIgnoreCase("chrome")){
			
			System.setProperty("webdriver.chrome.driver", exe);
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(bname.equalsIgnoreCase("ff")){
			System.setProperty("webdriver.gecko.driver", exe);
			driver=new FirefoxDriver();
			driver.manage().window().maximize();
		}
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "Action:bLaunch, input given: "+inputParameters[0].toString());
		}
		catch (Exception e) {
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "Action:bLaunch, input given: "+inputParameters[0].toString());
		}
		return outputParameters;
	}
	
	public static Hashtable<String, Object> openApp(Object[]inputParameters){
		try{
			
		String url=(String)inputParameters[0];
		driver.get(url);
		
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "Action:openApp, input given: "+inputParameters[0].toString());
		}
		catch (Exception e) {
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "Action:openApp, input given: "+inputParameters[0].toString());
		}
		return outputParameters;
	}
	
	public static Hashtable<String, Object> sendText(Object[]inputParameters){
		try{
		String text= (String)inputParameters[0];
		String xpath= (String)inputParameters[1];
		
		driver.findElement(By.xpath(xpath)).sendKeys(text);
		outputParameters.put("STATUS", "PASS");
		outputParameters.put("MESSAGE", "Action:sendText, input given: "+inputParameters[0].toString());
		}
		catch (Exception e) {
			outputParameters.put("STATUS", "FAIL");
			outputParameters.put("MESSAGE", "Action:sendText, input given: "+inputParameters[0].toString());
		}
		return outputParameters;
	}
	
	public static Hashtable<String, Object> clickOnElement(Object[]inputParameters){
		try{
	String xpath=(String) inputParameters[0];
	driver.findElement(By.xpath(xpath)).click();
	
	outputParameters.put("STATUS", "PASS");
	outputParameters.put("MESSAGE", "Action:clickOnElement, input given: "+inputParameters[0].toString());
		}
		catch (Exception e) {
			outputParameters.put("STATUS", "PASS");
			outputParameters.put("MESSAGE", "Action:clickOnElement, input given: "+inputParameters[0].toString());
		}
		return outputParameters;
	}
}
