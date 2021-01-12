package Utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

public class BaseTest{

public static WebDriver Wdriver=null;

String base_url;
String Bname;
	

	public WebDriver Driver()
	{

			
			try {
				Bname=System.getProperty("browser").toLowerCase().toString();
			}
			catch(Exception e)
			{
				System.out.println(e.toString());
				Bname="chrome";
			}		
			if(Wdriver==null) 
			{
				switch(Bname)
				{

				case "chrome":
					System.setProperty("webdriver.chrome.driver","F:\\Vision IT\\chromedriver.exe");
					Wdriver=new ChromeDriver();
					break;
				case "firefox":
					System.setProperty("webdriver.chrome.driver","C:\\Users\\hp\\Downloads\\geckodriver.exe");
					Wdriver= new FirefoxDriver();
					break;
				default:
					System.out.println("Entered wrong browser :"+Bname);
					break;


				}

			}

			return Wdriver;
	}




	

	public static void main(String args[])
	{
		BaseTest b=new BaseTest();
		b.Driver();
	}
	
	
}
