package TestSuites;

import Helper.Config;
import Pages.LoginPage;
import io.cucumber.java.en.Given;

public class CummonStepDef {

@Given(": Utilisateur est connecté avec le bon Username {string} et le bon password {string}")
public void utilisateur_est_connecté_avec_le_bon_username_et_le_bon_password( String name, String pwd) {
	Config.driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers");
	LoginPage  page = new LoginPage (Config.driver);
	page.connect(name ,pwd );
}


}
