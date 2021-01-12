package StepDefinition;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;

import PageObjects.LoginPageObjects;
import PageObjects.ProductDetailspage;
import PageObjects.ResultsPageObjects;
import PageObjects.SignupPage;
import Utilities.BaseTest;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import junit.framework.Assert;

public class SendAFriendFeature extends BaseTest{


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
		Driver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}

	@Given("user is logged in.")
	public void user_is_logged_in() {
		Driver().get("http://Automationpractice.com ");
		spo.clickon_element(spo.signInButtonHomePage);
		spo.sendKeystoelement(lpo.emailIdSignIn, "Beast@o0o8.com");
		spo.sendKeystoelement(lpo.passwordLoginPage, "pass1234");
		spo.clickon_element(lpo.signInButtonLoginPage);


	}

	@When("User selects category as Tshirt")
	public void user_selects_category_as_Tshirt() {
		spo.clickon_element(rpo.TshiirtSectionResultsPage);

	}

	@Then("User click on the product Faded Short Sleeve T-shirts")
	public void user_click_on_the_product_Faded_Short_Sleeve_T_shirts() {
		List<WebElement> l=Driver().findElements(rpo.resultsListResultsPage);
		spo.clickon_element(rpo.fadedTshirt);
		//l.get(0).click();

	}

	@Then("User opens the product in detail view and Clicks on Send to a Friend Link.")
	public void user_opens_the_product_in_detail_view_and_Clicks_on_Send_to_a_Friend_Link() {
		spo.clickon_element(pdp.sendtofriendlinkProductDetailPage);

	}

	@Then("User fills the details and clicks on send button")
	public void user_fills_the_details_and_clicks_on_send_button() {
		spo.sendKeystoelement(pdp.emailofFriendProductDetailPage, "Test@gm.com");
		spo.sendKeystoelement(pdp.nameOfFriendProductDetailPage, "Tyson");
		spo.clickon_element(pdp.sendemailtoFriendButtonProductDetailPage);
	}

	@Then("Confirmation msg should appear.")
	public void confirmation_msg_should_appear()
	{
		if(Driver().findElement(pdp.confirmationMsgProductDetailPage).getText().contains("Your e-mail has been sent successfully"))
		{
			spo.clickon_element(pdp.okconfirmationbuttonProductDetailPage);
			Assert.assertTrue(true);
			Driver().quit();
		}
		else
		{

			spo.clickon_element(pdp.okconfirmationbuttonProductDetailPage);

			Assert.fail();
			Driver().quit();
		}

	}








}
