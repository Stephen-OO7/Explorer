package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class QuickSearchObjects {

	WebDriver driver;
	Actions act=new Actions(driver);

	//field dropdowns
	public final By firstFieldDropdown=By.xpath("//button[contains(text(),'Title, Abstract, Claims (TAC)')]");
	public final By secondFieldDropdown=By.xpath("//button[contains(text(),'Assignee Orig & Norm (ASN)')]");
	public final By thirdFieldDropdown=By.xpath("//button[contains(text(),'Publication Date (PBD)')]");
	public final By firstOperatorDropdown=By.xpath("//div[@class='row modelContainer_1']//div[@class='col-1 pl-0 pr-0 q-search-op']//select[@class='form-control cs_operator_drop float-right ng-pristine ng-untouched ng-valid']");
	public final By secondOperatorDropdown=By.xpath("//div[@class='row modelContainer_2']//div[@class='col-1 pl-0 pr-0 q-search-op']//select[@class='form-control cs_operator_drop float-right ng-pristine ng-untouched ng-valid']");
	public final By SearchButtonInQuicksearch=By.xpath("//button[contains(text(),'Search')]");
	//
	public final By biblioQuicksearch=By.xpath("//ul[@class='dropdown-menu combineUl col-7 show']//li//div[@class='row CS_SubMenuPadding combineAlignPadding']//div[@class='col-xs-5 col-sm-5 col-md-4 col-lg-4 combineAlignPadding combineTextAlign']//a[@class='dropdown-item col-xs-12 col-sm-12 col-md-12 col-lg-12 combine_menu combineMenuPadding bg_biblio'][contains(text(),'BIBLIO')]");
	public final By classesQuicksearch=By.xpath("//ul[@class='dropdown-menu combineUl col-7 show']//li//div[@class='row CS_SubMenuPadding combineAlignPadding']//div[@class='col-xs-5 col-sm-5 col-md-4 col-lg-4 combineAlignPadding combineTextAlign']//a[@class='dropdown-item col-xs-12 col-sm-12 col-md-12 col-lg-12 combine_menu combineMenuPadding bg_classes'][contains(text(),'CLASSES')]");
	public final By textQuicksearch=By.xpath("//ul[@class='dropdown-menu combineUl col-7 show']//li//div[@class='row CS_SubMenuPadding combineAlignPadding']//div[@class='col-xs-5 col-sm-5 col-md-4 col-lg-4 combineAlignPadding combineTextAlign']//a[@class='dropdown-item col-xs-12 col-sm-12 col-md-12 col-lg-12 combine_menu combineMenuPadding bg_textEng'][contains(text(),'TEXT(EN)')]");
	public final By partiesQuicksearch=By.xpath("//ul[@class='dropdown-menu combineUl col-7 show']//li//div[@class='row CS_SubMenuPadding combineAlignPadding']//div[@class='col-xs-5 col-sm-5 col-md-4 col-lg-4 combineAlignPadding combineTextAlign']//a[@class='dropdown-item col-xs-12 col-sm-12 col-md-12 col-lg-12 combine_menu combineMenuPadding bg_parties'][contains(text(),'PARTIES')]");
	//Text boxes
	public final By firstFieldTextbox=By.xpath("//div[@class='combinepadding col-12 ng-scope']/div[@class='row modelContainer_0']/div[@class=' col-8 combineAlignPadding']/div/input");
	public final By firstFieldDateTextbox1=By.xpath("//div[@class='combinepadding col-12 ng-scope']/div[@class='row modelContainer_0']/div[@class=' col-8 combineAlignPadding']/div/input[1]");
	public final By firstFieldDateTextbox2=By.xpath("//div[@class='combinepadding col-12 ng-scope']/div[@class='row modelContainer_0']/div[@class=' col-8 combineAlignPadding']/div/input[2]");
	public final By secondFieldTextbox=By.xpath("//div[@class='combinepadding col-12 ng-scope']/div[@class='row modelContainer_1']/div[@class=' col-8 combineAlignPadding']/div/input");
	public final By secondFieldDateTextbox1=By.xpath("//div[@class='combinepadding col-12 ng-scope']/div[@class='row modelContainer_1']/div[@class=' col-8 combineAlignPadding']/div/input[1]");
	public final By secondFieldDateTextbox2=By.xpath("//div[@class='combinepadding col-12 ng-scope']/div[@class='row modelContainer_1']/div[@class=' col-8 combineAlignPadding']/div/input[2]");	
	public final By thirdFieldTextbox=By.xpath("//div[@class='combinepadding col-12 ng-scope']/div[@class='row modelContainer_2']/div[@class=' col-8 combineAlignPadding']/div/input");
	public final By thirdFieldDateTextbox1=By.xpath("//div[@class='combinepadding col-12 ng-scope']/div[@class='row modelContainer_2']/div[@class=' col-8 combineAlignPadding']/div/input[1]");
	public final By thirdFieldDateTextbox2=By.xpath("//div[@class='combinepadding col-12 ng-scope']/div[@class='row modelContainer_2']/div[@class=' col-8 combineAlignPadding']/div/input[2]");
	//Biblio Fields
	public final By publicationNoFieldBiblioQuicksearch=By.xpath("//ul[@class='dropdown-menu combineUl col-7 show']//li//div[@class='row CS_SubMenuPadding combineAlignPadding']//div[@class='col-xs-12 col-sm-12 col-md-8 col-lg-8 fieldList combineAlignPadding']//div[@id='biblio']//div[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu'][contains(text(),'Publication No (PNC)')]");
	public final By publicationDateFieldBiblioQuicksearch=By.xpath("//ul[@class='dropdown-menu combineUl col-7 show']//li//div[@class='row CS_SubMenuPadding combineAlignPadding']//div[@class='col-xs-12 col-sm-12 col-md-8 col-lg-8 fieldList combineAlignPadding']//div[@id='biblio']//div[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu'][contains(text(),'Publication Date (PBD)')]");
	public final By publicationYearFieldBiblioQuicksearch=By.xpath("//ul[@class='dropdown-menu combineUl col-7 show']//li//div[@class='row CS_SubMenuPadding combineAlignPadding']//div[@class='col-xs-12 col-sm-12 col-md-8 col-lg-8 fieldList combineAlignPadding']//div[@id='biblio']//div[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu'][contains(text(),'Publication Year (PBY)')]");
	public final By applicationNoFieldBiblioQuicksearch=By.xpath("//ul[@class='dropdown-menu combineUl col-7 show']//li//div[@class='row CS_SubMenuPadding combineAlignPadding']//div[@class='col-xs-12 col-sm-12 col-md-8 col-lg-8 fieldList combineAlignPadding']//div[@id='biblio']//div[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu'][contains(text(),'Application No (APN)')]");
	public final By applicationDateFieldBiblioQuicksearch=By.xpath("//ul[@class='dropdown-menu combineUl col-7 show']//li//div[@class='row CS_SubMenuPadding combineAlignPadding']//div[@class='col-xs-12 col-sm-12 col-md-8 col-lg-8 fieldList combineAlignPadding']//div[@id='biblio']//div[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu'][contains(text(),'Application No (APN)')]");
	public final By applicationYearFieldBiblioQuicksearch=By.xpath("//ul[@class='dropdown-menu combineUl col-7 show']//li//div[@class='row CS_SubMenuPadding combineAlignPadding']//div[@class='col-xs-12 col-sm-12 col-md-8 col-lg-8 fieldList combineAlignPadding']//div[@id='biblio']//div[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu'][contains(text(),'Application No (APN)')]");
	public final By priorityNoFieldBiblioQuicksearch=By.xpath("//ul[@class='dropdown-menu combineUl col-7 show']//li//div[@class='row CS_SubMenuPadding combineAlignPadding']//div[@class='col-xs-12 col-sm-12 col-md-8 col-lg-8 fieldList combineAlignPadding']//div[@id='biblio']//div[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu'][contains(text(),'Priority No (PRN)')]");
	public final By prioritycountryFieldBiblioQuicksearch=By.xpath("//ul[@class='dropdown-menu combineUl col-7 show']//li//div[@class='row CS_SubMenuPadding combineAlignPadding']//div[@class='col-xs-12 col-sm-12 col-md-8 col-lg-8 fieldList combineAlignPadding']//div[@id='biblio']//div[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu'][contains(text(),'Priority Country (PRC)')]");
	public final By priorityDatesFieldBiblioQuicksearch=By.xpath("//ul[@class='dropdown-menu combineUl col-7 show']//li//div[@class='row CS_SubMenuPadding combineAlignPadding']//div[@class='col-xs-12 col-sm-12 col-md-8 col-lg-8 fieldList combineAlignPadding']//div[@id='biblio']//div[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu'][contains(text(),'Priority Dates (PRD)')]");
	//Text Fields
	public final By titleAbstractFieldTextQuicksearch=By.xpath("//ul[@class='dropdown-menu combineUl col-7 show']//li//div[@class='row CS_SubMenuPadding combineAlignPadding']//div[@class='col-xs-12 col-sm-12 col-md-8 col-lg-8 fieldList combineAlignPadding']//div[@id='textEng']//div[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu'][contains(text(),'Title, Abstract (TA)')]");
	public final By FulltextFieldTextQuicksearch=By.xpath("//ul[@class='dropdown-menu combineUl col-7 show']//li//div[@class='row CS_SubMenuPadding combineAlignPadding']//div[@class='col-xs-12 col-sm-12 col-md-8 col-lg-8 fieldList combineAlignPadding']//div[@id='textEng']//div[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu'][contains(text(),'FullText (TACD)')]");
	public final By claimsFieldTextQuicksearch=By.xpath("//ul[@class='dropdown-menu combineUl col-7 show']//li//div[@class='row CS_SubMenuPadding combineAlignPadding']//div[@class='col-xs-12 col-sm-12 col-md-8 col-lg-8 fieldList combineAlignPadding']//div[@id='textEng']//div[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu'][contains(text(),'Claims (C)')]");
	public final By titleAbstractClaimsFieldTextQuicksearch=By.xpath("//ul[@class='dropdown-menu combineUl col-7 show']//li//div[@class='row CS_SubMenuPadding combineAlignPadding']//div[@class='col-xs-12 col-sm-12 col-md-8 col-lg-8 fieldList combineAlignPadding']//div[@id='textEng']//div[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu'][contains(text(),'Title, Abstract, Claims (TAC)')]");
	public final By independentClaimsFieldTextQuicksearch=By.xpath("//ul[@class='dropdown-menu combineUl col-7 show']//li//div[@class='row CS_SubMenuPadding combineAlignPadding']//div[@class='col-xs-12 col-sm-12 col-md-8 col-lg-8 fieldList combineAlignPadding']//div[@id='textEng']//div[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu'][contains(text(),'Independent Claims (INC)')]");
	//Parties
	public final By allAssigneeFieldPartiesQuicksearch=By.xpath("//ul[@class='dropdown-menu combineUl col-7 show']//li//div[@class='row CS_SubMenuPadding combineAlignPadding']//div[@class='col-xs-12 col-sm-12 col-md-8 col-lg-8 fieldList combineAlignPadding']//div[@id='parties']//div[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu'][contains(text(),'All Assignees (AASN)')]");
	public final By assigneeOrigAndNormalizedFieldPartiesQuicksearch=By.xpath("//ul[@class='dropdown-menu combineUl col-7 show']//li//div[@class='row CS_SubMenuPadding combineAlignPadding']//div[@class='col-xs-12 col-sm-12 col-md-8 col-lg-8 fieldList combineAlignPadding']//div[@id='parties']//div[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu'][contains(text(),'Assignee Orig & Norm (ASN)')]");
	public final By currentAssigneeFieldPartiesQuicksearch=By.xpath("//ul[@class='dropdown-menu combineUl col-7 show']//li//div[@class='row CS_SubMenuPadding combineAlignPadding']//div[@class='col-xs-12 col-sm-12 col-md-8 col-lg-8 fieldList combineAlignPadding']//div[@id='parties']//div[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu'][contains(text(),'All Assignees (AASN)')]");
	public final By currentOrigNormAssigneeFieldPartiesQuicksearch=By.xpath("//ul[@class='dropdown-menu combineUl col-7 show']//li//div[@class='row CS_SubMenuPadding combineAlignPadding']//div[@class='col-xs-12 col-sm-12 col-md-8 col-lg-8 fieldList combineAlignPadding']//div[@id='parties']//div[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu'][contains(text(),'Current & Orig & Norm Assignees (CAAN)')]");
	public final By inventorFieldPartiesQuicksearch=By.xpath("//ul[@class='dropdown-menu combineUl col-7 show']//li//div[@class='row CS_SubMenuPadding combineAlignPadding']//div[@class='col-xs-12 col-sm-12 col-md-8 col-lg-8 fieldList combineAlignPadding']//div[@id='parties']//div[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu'][contains(text(),'Inventors (INV)')]");
	public final By attornyFieldPartiesQuicksearch=By.xpath("//ul[@class='dropdown-menu combineUl col-7 show']//li//div[@class='row CS_SubMenuPadding combineAlignPadding']//div[@class='col-xs-12 col-sm-12 col-md-8 col-lg-8 fieldList combineAlignPadding']//div[@id='parties']//div[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu'][contains(text(),'Attorney (ATN)')]");
	public final By currentownerFieldPartiesQuicksearch=By.xpath("//ul[@class='dropdown-menu combineUl col-7 show']//li//div[@class='row CS_SubMenuPadding combineAlignPadding']//div[@class='col-xs-12 col-sm-12 col-md-8 col-lg-8 fieldList combineAlignPadding']//div[@id='parties']//div[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu'][contains(text(),'Current Owner (PASN)')]");
	public final By examinerFieldPartiesQuicksearch=By.xpath("//ul[@class='dropdown-menu combineUl col-7 show']//li//div[@class='row CS_SubMenuPadding combineAlignPadding']//div[@class='col-xs-12 col-sm-12 col-md-8 col-lg-8 fieldList combineAlignPadding']//div[@id='parties']//div[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu'][contains(text(),'Examiner (EXMR)')]");
	//Classes
	public final By ACFieldClassesQuicksearch=By.xpath("//ul[@class='dropdown-menu combineUl col-7 show']//li//div[@class='row CS_SubMenuPadding combineAlignPadding']//div[@class='col-xs-12 col-sm-12 col-md-8 col-lg-8 fieldList combineAlignPadding']//div[@id='classes']//div[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu'][contains(text(),'All Classes (AC)')]");
	public final By CPCFieldClassesQuicksearch=By.xpath("//ul[@class='dropdown-menu combineUl col-7 show']//li//div[@class='row CS_SubMenuPadding combineAlignPadding']//div[@class='col-xs-12 col-sm-12 col-md-8 col-lg-8 fieldList combineAlignPadding']//div[@id='classes']//div[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu'][contains(text(),'All Classes (AC)')]");
	public final By IPCFieldClassesQuicksearch=By.xpath("//ul[@class='dropdown-menu combineUl col-7 show']//li//div[@class='row CS_SubMenuPadding combineAlignPadding']//div[@class='col-xs-12 col-sm-12 col-md-8 col-lg-8 fieldList combineAlignPadding']//div[@id='classes']//div[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu'][contains(text(),'IPC All Versions(IC)')]");
	public final By LOCFieldClassesQuicksearch=By.xpath("<div class=\"col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu\" fieldid=\"LOC\" fieldcode=\"83\" ng-click=\"getField(83);\" xpath=\"1\">Locarno Classification (LOC)</div>");
	public final By UCFieldClassesQuicksearch=By.xpath("//ul[@class='dropdown-menu combineUl col-7 show']//li//div[@class='row CS_SubMenuPadding combineAlignPadding']//div[@class='col-xs-12 col-sm-12 col-md-8 col-lg-8 fieldList combineAlignPadding']//div[@id='classes']//div[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu'][contains(text(),'US Classification (UC)')]");
	public final By FIFieldClassesQuicksearch=By.xpath("//ul[@class='dropdown-menu combineUl col-7 show']//li//div[@class='row CS_SubMenuPadding combineAlignPadding']//div[@class='col-xs-12 col-sm-12 col-md-8 col-lg-8 fieldList combineAlignPadding']//div[@id='classes']//div[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu'][contains(text(),'Japan FI (FI)')]");
	public final By FTermFieldClassesQuicksearch=By.xpath("//ul[@class='dropdown-menu combineUl col-7 show']//li//div[@class='row CS_SubMenuPadding combineAlignPadding']//div[@class='col-xs-12 col-sm-12 col-md-8 col-lg-8 fieldList combineAlignPadding']//div[@id='classes']//div[@class='col-xs-12 col-sm-12 col-md-12 col-lg-12 combineSubmenu'][contains(text(),'Japan FTerm (FTERM)')]");


	public QuickSearchObjects(WebDriver driver1)
	{
		this.driver=driver1;
	}

	//Methods
	public void mouseHoverOnSectionQuicksearch(By dropdown,By sectionName)
	{

		driver.findElement(dropdown).click();
		act.moveToElement(driver.findElement(sectionName));

	}
	public void selectFieldQuicksearch(By FieldToSelected)

	{

		driver.findElement(FieldToSelected).click();

	}
	public void enterDataInTextboxQuicksearch(By Textbox,String data)
	{
		driver.findElement(Textbox).sendKeys(data);
	}
	
	public void enterDataInTwoDateRangesQuicksearch(By from,String data1,By to,String data2)
	{
		driver.findElement(from).sendKeys(data1);
		driver.findElement(to).sendKeys(data2);
	}

	public void clickOnSearchButtonQuicksearch()
	{

		driver.findElement(SearchButtonInQuicksearch).click();
	}
	
	public void selectOperatorFromDropdownQuicksearch(By operatorDropdown,String operator)
	{
		Select sel=new Select(driver.findElement(operatorDropdown));
		sel.selectByVisibleText(operator.toUpperCase());
		
	}

}
