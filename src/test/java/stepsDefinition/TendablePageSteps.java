package stepsDefinition;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import Pages.TendableHomePage;
import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class TendablePageSteps {

	TendableHomePage page = new TendableHomePage(DriverFactory.getDriver());
	
	@Given("I am at homepage")
	public void i_am_at_homepage() {
		WebDriver driver = DriverFactory.getDriver();
	    driver.get("https://www.tendable.com/");
	}

	@Then("Homepage is accesible")
	public void homepage_is_accesible() {
		boolean isGettingDisplayed = page.verifyHome();
		Assert.assertTrue(isGettingDisplayed);
	}

	@Then("Our Story page is enable")
	public void our_story_page_is_enable() {
	    page.verifyOurStory();
	    boolean isGettingDisplayed = page.verifyOurStory();
		Assert.assertTrue(isGettingDisplayed);
	}

	@Then("Our Soltion is present")
	public void our_soltion_is_present() {
	    page.verifyOurSolution();
	}

	@Then("Why tendable is accessible")
	public void why_tendable_is_accessible() {
	    page.verifyWhyTendable();
	}

	@When("Click on request a demo button is accessible")
	public void click_on_request_a_demo_button_is_accessible() {
	   page.verifyReqDemo();
	   boolean isGettingDisplayed = page.verifyReqDemo();
	   Assert.assertTrue(isGettingDisplayed);
	}

	@Then("on Top level menu page Request a demo is present")
	public void on_top_level_menu_page_request_a_demo_is_present() {
	    page.verifyReqDemoOnMenu();
	}

	@When("I click at Contact Us")
	public void i_click_at_contact_us() {
	   page.verifyContactUs();
	}

	@When("I clicked at Marketing")
	public void i_clicked_at_marketing() {
	    page.verifyMarketing();
	}

	@When("I filled the form")
	public void i_filled_the_form() {
	    page.fillDetails();
	}

	@Then("On submitting it should display error message")
	public void on_submitting_it_should_display_error_message() {
	   page.verifySubmit();
	   boolean isGettingDisplayed = page.verifyErrorMsg();
	   Assert.assertTrue(isGettingDisplayed);
	}

}

