package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class IRCTCLOGIN {
	 
public WebDriver driver;
public IRCTCLOGIN(WebDriver driver) {
	driver = driver;
	PageFactory.initElements(driver, this);
}
@FindBy (xpath="(//input[@role=\"searchbox\"])[1]")
WebElement from;

@FindBy (xpath="(//input[@role=\"searchbox\"])[2]")
WebElement to;

@FindBy (xpath="//div[@class=\"ng-tns-c65-12 ui-dropdown ui-widget ui-state-default ui-corner-all\"]")
WebElement general;
@FindBy (xpath="(//input[@role=\"searchbox\"])[2]")
WebElement jml;;
@FindBy (xpath="(//input[@role=\"searchbox\"])[2]")
WebElement nkl;

}
