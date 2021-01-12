package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Utilities.BaseTest;
public class ResultsPageObjects extends BaseTest{
	

	
	public final By signOutResultsPage=By.xpath("//a[@class='logout']");
	public final By TshiirtSectionResultsPage=By.xpath("//ul[@class='sf-menu clearfix menu-content sf-js-enabled sf-arrows']/li[3]/a");
	public final By resultsListResultsPage=By.xpath("//ul[@class='product_list grid row']/li");
	public final By fadedTshirt=By.xpath("//a[contains(text(),'Faded Short Sleeve T-shirts')]");

	
	

}
