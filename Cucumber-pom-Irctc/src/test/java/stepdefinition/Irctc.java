package stepdefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageobject.IRCTCLOGIN;

public class Irctc {
 WebDriver driver;	
	public IRCTCLOGIN ip;
	
	
	
	@Given("open chrome browser")
	public void open_chrome_browser() throws Throwable {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(opt);
		driver.manage().window().maximize();
		ip = new IRCTCLOGIN(driver);
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
  
	@When("open the url{string}")
	public void open_url(string url) throws Throwable {
		driver.get(url);
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}
	@When("^from as click$")
	public void from_as_click() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^to as click$")
	public void to_as_click() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^General$")
	public void general() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^date should select$")
	public void date_should_select() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^All Classes Should be Select$")
	public void all_Classes_Should_be_Select() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@When("^click on search button$")
	public void click_on_search_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^User log sucessfully$")
	public void user_log_sucessfully() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}



}
