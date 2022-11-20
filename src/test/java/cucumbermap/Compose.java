package cucumbermap;

import java.util.Hashtable;

import cucumber.api.java.en.When;
import utility.HTMLReportGenerator;
import utility.SeleniumOperation;

public class Compose {

	@When("^user opens \"(.*)\" browser with exe as \"(.*)\"$")
	public void open_browser(String bname, String exe)  {
	    Object [] input= new Object[2];
	    input[0]=bname;
	    input[1]=exe;
	   Hashtable<String, Object> output=SeleniumOperation.bLaunch(input);
	   HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "^user opens \"([^\"]*)\" browser with exe as ",output.get("MESSAGE").toString());
	    
	}
	
	@When("^enter url as \"([^\"]*)\"$")
	public void openUrl(String url)
	{
		Object[] input=new Object[1];
		input[0]=url;
		Hashtable<String, Object> output=SeleniumOperation.openApp(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "^enter url as ",output.get("MESSAGE").toString());
	}
	
	@When("^enter user name as \"([^\"]*)\"$")
	public void enter_user_name(String uname){
		Object [] input= new Object[2];
		input[0]=uname;
		input[1]="//*[@Id='identifierId']";
		Hashtable<String, Object> output=SeleniumOperation.sendText(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "^enter user name as ",output.get("MESSAGE").toString());
	}
	
	@When("^click on Next button$")
	public void click_on_Next_button() {
		Object [] input= new Object[1];
		input[0]="//*[text()='Next']";
		Hashtable<String, Object> output=SeleniumOperation.clickOnElement(input);
		HTMLReportGenerator.StepDetails(output.get("STATUS").toString(), "^click on Next button$ ",output.get("MESSAGE").toString());
		
	}
	
	
	
	
	
}
