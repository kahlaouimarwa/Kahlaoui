package TestSuites;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.HomePage;
import Pages.LoginPage;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPagesStepDef {
	@Before
	public void init() {
		Config.confchrome();
		Config.driver= new ChromeDriver();
		Config.maximiseWindow();
	}
	@Given(": admin is on login page")
	public void admin_is_on_login_page() {
	    
		Config.driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

	}
	
	@When("admin enter correct username{string} and correct password {string}")
	public void admin_enter_correct_username_and_correct_password(String username,String pwd) {
		LoginPage page = new LoginPage(Config.driver);
		page.connect(username, pwd);
	}
	@When("admin enter correct username {string} and wrong password {string}")
	public void admin_enter_correct_username_and_wrong_password(String username, String pwd) {
		LoginPage page = new LoginPage(Config.driver);
		page.connect(username, pwd);	    
	}
	@Then("admin is directed to the hompage that contains string ")
	public void admin_is_directed_to_the_home_page_that_contains_(String msg) {
		HomePage home = new HomePage(Config.driver);
	 
	    String actualMessage = home.verifMessage();
	    Assert.assertEquals(msg, actualMessage);
	}

	@Then("admin is still on login page that contains message {string}")
	public void admin_is_still_on_login_page_that_contains_message(String string) {
	    
	}

}
	
