package PageObjects;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import Utilities.BaseTest;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SignupPage extends  BaseTest{
	
	WebDriver driver;
	public SignupPage(WebDriver driver)
	{
		this.driver=driver;
	Driver().manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	}
	WebDriverWait wait=new WebDriverWait(Driver(), 60);
	

	
	public final By mrRadioButtonSignupPage=By.xpath("//input[@id='id_gender1']");
	public final By mrsRadioButtonSignupPage=By.xpath("//input[@id='id_gender2']");
	public final By firstNameSignupPage=By.xpath("//input[@id='customer_firstname']");
	public final By lastNameSignupPage=By.xpath("//input[@id='customer_lastname']");
	public final By passwordSignupPage=By.xpath("//input[@id='passwd']");
	public final By dayDropdownSignupPage=By.xpath("//select[@id='days']");
	public final By monthDropdownSignupPage=By.xpath("//select[@id='months']");
	public final By yearDropdownSignupPage=By.xpath("//select[@id='years']");
	public final By addressAddressSignupPage=By.xpath("//input[@id='address1']");
	public final By cityAddressSignupPage=By.xpath("//input[@id='city']");
	public final By stateDropdownAddressSignupPage=By.xpath("//select[@id='id_state']");
	public final By zipcodeAddressSignupPage=By.xpath("//input[@id='postcode']");
	public final By countryDropdownAddressSignupPage=By.xpath("//select[@id='id_country']");
	public final By mobileNoAddressSignupPage=By.xpath("//input[@id='phone_mobile']");
	public final By secondaryAddressAddressSignupPage=By.xpath("//input[@id='alias']");
	public final By registerSignupPage=By.xpath("//span[contains(text(),'Register')]");
	public final By signInButtonHomePage=By.xpath("//div[@class='row']/nav/div[1]/a");
	
	public final String accountUrl="http://automationpractice.com/index.php?controller=my-account";
	
	
	
	public void clickon_element(By element)
	{	
		//wait.until(ExpectedConditions.visibilityOfElementLocated(element));
		Driver().findElement(element).click();
	}
	public void sendKeystoelement(By element,String data)
	{	
		wait.until(ExpectedConditions.visibilityOfElementLocated(element));
		Driver().findElement(element).sendKeys(data);
	}
	public void selectValueFromDropdown(By dropdown,String text)
	{
	//	wait.until(ExpectedConditions.visibilityOfElementLocated(dropdown));
		Select sel=new Select(Driver().findElement(dropdown));
		sel.selectByVisibleText(text);
		
	}

}
