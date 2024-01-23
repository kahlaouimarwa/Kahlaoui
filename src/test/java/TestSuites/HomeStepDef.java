package TestSuites;

import org.openqa.selenium.chrome.ChromeDriver;

import Helper.Config;
import Pages.HomePage;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomeStepDef {
	//@Before
	public void init() {
		Config.confchrome();
		Config.driver= new ChromeDriver () ;
		Config.maximiseWindow();
	}
	@Given(": utilisateur est sur la page home")
	public void utilisateur_est_sur_la_page_home() {
	
	Config.driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
	    
	}
	
	@Then("admin is directed to the hompage that contains\" Dashboard \"")
	public void admin_is_directed_to_the_hompage_that_contains_dashboard() {
}
}
