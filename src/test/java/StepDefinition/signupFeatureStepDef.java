package StepDefinition;

import java.util.List;



import org.junit.Assert;

import org.junit.BeforeClass;
import org.junit.internal.runners.statements.Fail;
import org.openqa.selenium.By;

import PageObjects.LoginPageObjects;
import PageObjects.ProductDetailspage;
import PageObjects.ResultsPageObjects;
import PageObjects.SignupPage;
import Utilities.BaseTest;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class signupFeatureStepDef extends BaseTest{
	

		LoginPageObjects lpo;
		ProductDetailspage pdp;
		SignupPage spo;
		ResultsPageObjects rpo;
		
		@Before
		public void setup()
		{
			 lpo=new LoginPageObjects();
			 pdp=new ProductDetailspage();
			 spo= new SignupPage(Driver());
			 rpo=new ResultsPageObjects();
		}
	
	@Given("User is on {string}")
	public void user_is_on(String string) {
		Driver().get(string);   
		
	}

	@When("user clicks on sign in button on the homepage")
	public void user_clicks_on_sign_in_button_on_the_homepage() {
		Driver().navigate().refresh();
		spo.clickon_element(spo.signInButtonHomePage);
	  
	}

	@When("user enters {string} in the create new account email id field.")
	public void user_enters_in_the_create_new_account_email_id_field(String string) {
		spo.sendKeystoelement(lpo.emailIdSignUp, string);
	   
	}

	@Then("user clicks on create an account button.")
	public void user_clicks_on_create_an_account_button() {
		
		spo.clickon_element(lpo.createAccountButtonLoginPage);
	}

	@Then("user fills all the details in the add new user details form")
	public void user_fills_all_the_details_in_the_add_new_user_details_form(DataTable dt) throws InterruptedException {
		List <String> l =dt.asList();
		System.out.println(l.size());
		spo.sendKeystoelement(spo.firstNameSignupPage, l.get(0));
		spo.sendKeystoelement(spo.lastNameSignupPage, l.get(1));
		spo.sendKeystoelement(spo.passwordSignupPage, l.get(2));
		spo.sendKeystoelement(spo.addressAddressSignupPage, l.get(3));
		spo.sendKeystoelement(spo.cityAddressSignupPage, l.get(4));
		spo.selectValueFromDropdown(spo.stateDropdownAddressSignupPage, l.get(5));
		
		spo.sendKeystoelement(spo.zipcodeAddressSignupPage, l.get(6));
		
		spo.selectValueFromDropdown(spo.countryDropdownAddressSignupPage, l.get(7));
		spo.sendKeystoelement(spo.mobileNoAddressSignupPage, l.get(8));
		spo.sendKeystoelement(spo.secondaryAddressAddressSignupPage, l.get(9));
		
		
	   
	}

	@Then("user clicks on register button")
	public void user_clicks_on_register_button() {
		spo.clickon_element(spo.registerSignupPage);
	   
	}

	@Then("user should be navigated to the homepage of newly created account and then user loggs out.")
	public void user_should_be_navigated_to_the_homepage_of_newly_created_account() throws InterruptedException {
		Thread.sleep(500);
		if(Driver().getCurrentUrl().contains(spo.accountUrl))
		{
			spo.clickon_element(rpo.signOutResultsPage);
			Assert.assertTrue(true);
		}
		else
		{
			Assert.fail();
		}
		
	    
	}

	

	@Then("user enters {string} in the Email id field")
	public void user_enters_in_the_Email_id_field(String string) {
		spo.sendKeystoelement(lpo.emailIdSignIn, string);
		
		
	   
	}

	@Then("user enters {string} in password field.")
	public void user_enters_in_password_field(String string) {
		spo.sendKeystoelement(lpo.passwordLoginPage, string);
	}

	@Then("user clicks on sign in button.")
	public void user_clicks_on_sign_in_button() {
		spo.clickon_element(lpo.signInButtonLoginPage);
	    
	}
	@Then("user should be navigated to the homepage of newly created account")
	public void signinvalidate() throws InterruptedException
	{
		Thread.sleep(500);
		if(Driver().getCurrentUrl().contains(spo.accountUrl))
		{
			spo.clickon_element(rpo.signOutResultsPage);
			Driver().quit();
			Assert.assertTrue(true);
		}
		else
		{
			Driver().quit();
			Assert.fail();
		}
		
	}

	
}
