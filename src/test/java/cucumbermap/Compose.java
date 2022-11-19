package cucumbermap;

import cucumber.api.java.en.When;
import utility.SeleniumOperation;

public class Compose {

	@When("^user opens \"([^\"]*)\" browser with exe as \"([^\"]*)\"$")
	public void open_browser(String bname, String exe)  {
	    Object [] input= new Object[2];
	    input[0]=bname;
	    input[1]=exe;
	    SeleniumOperation.bLaunch(input);
	    
	}
	
	@When("^enter url as \"([^\"]*)\"$")
	public void openUrl(String url)
	{
		Object[] input=new Object[1];
		input[0]=url;
		SeleniumOperation.openApp(input);
	}
	
	@When("^enter user name as \"([^\"]*)\"$")
	public void enter_user_name(String uname){
		Object [] input= new Object[2];
		input[0]=uname;
		input[1]="//*[@Id='identifierId']";
		SeleniumOperation.sendText(input);
	}
	
	@When("^click on Next button$")
	public void click_on_Next_button() {
		Object [] input= new Object[1];
		input[0]="//*[text()='Next']";
		SeleniumOperation.clickOnElement(input);
		
	}
	
	
	
	
	
}
