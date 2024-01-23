package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Helper.Config;

public class LoginPage {
	@FindBy (xpath=" /html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[1]/div[1]/div[2]/input[1]")
	WebElement userName ;
	
	@FindBy (xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/form[1]/div[2]/div[1]/div[2]/input[1]")
	WebElement password;
	
	@FindBy(xpath="/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")
	WebElement submit;
	@FindBy (xpath= "/html/body/div/div[1]/div/div[1]/div/div[2]/div[2]/div/div[1]/div[1]/p")
	WebElement verifWrongCredentials ;
	public LoginPage(WebDriver driver) {
		PageFactory.initElements(Config.driver, this);
		}
	public void connect(String Username, String Password){
		Config.attente(10);
		userName.sendKeys(Username);
		password.sendKeys(Password);
		submit.click();
	}
		
		public String verifMessage () {
			
			String actualMessage = verifWrongCredentials.getText();
			return actualMessage;
	}
}