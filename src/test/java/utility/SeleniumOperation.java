package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SeleniumOperation {

	public static WebDriver driver=null;
	
	public static void bLaunch(Object[]inputParameters){
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
	}
	
	public static void openApp(Object[]inputParameters){
		String url=(String)inputParameters[0];
		driver.get(url);
	}
	
	public static void sendText(Object[]inputParameters){
		String text= (String)inputParameters[0];
		String xpath= (String)inputParameters[1];
		
		driver.findElement(By.xpath(xpath)).sendKeys(text);
	}
	
	public static void clickOnElement(Object[]inputParameters){
	String xpath=(String) inputParameters[0];
	driver.findElement(By.xpath(xpath)).click();
	
	}
}
