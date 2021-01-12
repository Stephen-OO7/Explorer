package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import Utilities.BaseTest;

public class ProductDetailspage extends BaseTest {

	
	public final By sendtofriendlinkProductDetailPage=By.xpath("//a[@id='send_friend_button']");
	public final By nameOfFriendProductDetailPage=By.xpath("//input[@id='friend_name']");
	public final By emailofFriendProductDetailPage=By.xpath("//input[@id='friend_email']");
	public final By sendemailtoFriendButtonProductDetailPage=By.xpath("//button[@id='sendEmail']//span[contains(text(),'Send')]");
	public final By okconfirmationbuttonProductDetailPage=By.xpath("//input[@type='button' and @value='OK']");
	public final By confirmationMsgProductDetailPage=By.xpath("//p[contains(text(),'Your e-mail has been sent successfully')]");
	public final By reviewtitleProductDetailPage=By.xpath("//input[@id='comment_title']");
	
	public final By reviewcommentProductDetailPage=By.xpath("//textarea[@id='content']");
	public final By reviewsendProductDetailPage=By.xpath("//button[@id='submitNewMessage']//span[contains(text(),'Send')]");
	public final By okconfirmationreviewProductDetailPage=By.xpath("//span[contains(text(),'OK')]");
	
	public final By bluecolorProductDetailPage=By.xpath("//a[@id='color_14']");	
	public final By orangecolorProductDetailPage=By.xpath("//a[@id='color_13']");
	
	
	
	


}
