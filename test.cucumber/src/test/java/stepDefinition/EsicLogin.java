package stepDefinition;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class EsicLogin {
	
	@Given("i need to Check ESIC website")
	public void i_need_to_check_esic_website() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		WebDriver driver = new FirefoxDriver();
		driver.get("http://esic.gov.in/");
		System.out.println("Check Given");
		driver.close();
	}
	@When("i am unable to login")
	public void i_am_unable_to_login() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new io.cucumber.java.PendingException();
		System.out.println("Check When");
	}
	@Then("need to connect VPN first")
	public void need_to_connect_vpn_first() {
	    // Write code here that turns the phrase above into concrete actions window.scrollBy(0,document.body.scrollHeight)
	    //throw new io.cucumber.java.PendingException();//h5[contains(text(),'Employer Login')]
		System.out.println("Check Then");
	
	}

	
}
