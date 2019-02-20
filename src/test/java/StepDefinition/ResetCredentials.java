package StepDefinition;

import java.util.List;
import java.util.Map;

import org.testng.annotations.BeforeTest;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class ResetCredentials {
	String url,Username, Password = null;
	
	@Given("^Open the Firefox and launch the application$")				
    public void open_the_Firefox_and_launch_the_application() throws Throwable							
    {		
        loginPagestep.launchUrl(url);					
    }		

	@When("^Enter the Username and Password$")			
    public void enter_the_Username_and_Password(DataTable usercredentials) throws Throwable
    {		
       List<Map<String,String>> data = usercredentials.asMaps(String.class,String.class);
       System.out.println("This step enter the Username and Password on the login page.");
       for (int i =0; i<data.size();i++)
       {
    	   loginPagestep.EnterUser(data.get(i).get("username"));
       
          loginPagestep.EnterPass(data.get(i).get("password"));
          loginPagestep.clickResetbtn();
       } 
    	
    }		

    @Then("^Reset the credential$")					
    public void Reset_the_credential() throws Throwable 							
    {    		
        System.out.println("This step to close the browser.");		
        //loginPagestep.clickResetbtn();
        drivers.closebrowser();
    }

		

}
