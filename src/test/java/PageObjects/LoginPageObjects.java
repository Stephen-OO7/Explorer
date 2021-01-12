package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import Utilities.BaseTest;

public class LoginPageObjects extends BaseTest{
	
	
	
	
	
	
	public final By emailIdSignUp=By.xpath("//input[@id='email_create']");
	public final By emailIdSignIn=By.xpath("//input[@id='email']");
	public final By createAccountButtonLoginPage=By.xpath("//button[@id='SubmitCreate']");
	public final By signInButtonLoginPage=By.xpath("//button[@id='SubmitLogin']");
	public final By passwordLoginPage=By.xpath("//input[@id='passwd']");
	public final By forgotPasswordLoginPage=By.xpath("//a[contains(text(),'Forgot your password?')]");
	
	
	
	
	
	
	

}
