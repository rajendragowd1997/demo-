package stepDefination;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class Data {
	WebDriver driver;
	@Given("^url as https://www\\.irctc\\.co\\.in/nget/train-search$")
	public void url_as_https_www_irctc_co_in_nget_train_search() throws Throwable {
	System.setProperty("webdriver,chrome.driver","D:\\mng\\11-batch\\eclipse-workspace\\cucumber-project1\\chromedriver112.exe");
	driver = new ChromeDriver();
	driver.manage().deleteAllCookies();
	driver.get("appurl");
	Thread.sleep(3000);
	}
	@When("^click on popup link$")
	public void click_on_popup_link() throws Throwable {
	 driver.findElement(By.xpath("//button[normalize-space()='OK']")).click();
	}
	
	@When("^click on register link$")
	public void click_on_register_link() throws Throwable {
	driver.findElement(By.xpath("//a[normalize-space()='REGISTER']")).click();
	}

	@Then("^enter name$")
	public void enter_name() throws Throwable {
	driver.findElement(By.xpath("//input[@id='userName']")).sendKeys("raj");
	}

	@Then("^enter password$")
	public void enter_password() throws Throwable {
	WebElement pass =driver.findElement(By.xpath("//input[@id='usrPwd']"));
	pass.click();
	pass.sendKeys("456");
	}

	@Then("^click on confirm password$")
	public void click_on_confirm_password() throws Throwable {
		WebElement conpass =driver.findElement(By.xpath("//input[@id='cnfUsrPwd']"));
		conpass.click();
		conpass.sendKeys("456");
	}

	@Then("^click on language textbox$")
	public void click_on_language_textbox() throws Throwable {
		WebElement lan =driver.findElement(By.xpath("//div[@class='ng-tns-c65-14 ui-dropdown ui-widget ui-state-default ui-corner-all']"));
		lan.click();
		driver.findElement(By.xpath("//li[@aria-label='English']")).click();
	}

	@Then("^selecty on question$")
	public void selecty_on_question() throws Throwable {
	driver.findElement(By.xpath("//div[@class='ng-tns-c65-15 ui-dropdown ui-widget ui-state-default ui-corner-all']")).click();
	
	}
     
	@Then("^enter text$")
	public void enter_text() throws Throwable {
	  WebElement enter = driver.findElement(By.xpath("//input[@placeholder='Security Answer']"));
	  enter.click();
	  enter.sendKeys("ntr");
	}

	@Then("^click on continue$")
	public void click_on_continue() throws Throwable {
	  driver.findElement(By.xpath("//button[normalize-space()='Continue']")).click();
	}

	

}










