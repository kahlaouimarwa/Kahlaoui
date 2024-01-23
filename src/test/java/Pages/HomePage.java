package Pages;
import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import Helper.Config;

public class HomePage {
	@FindBy(tagName ="h6")
	WebElement HomeDashboardMessage;
	
@FindBy (xpath="/html/body/div/div[1]/div[1]/aside/nav/div[2]/ul[1]/li/a/*span")
List<WebElement> menus ;
	
	public HomePage (WebDriver driver) {
		PageFactory.initElements(Config.driver,this);
	}
	public String verifMessage () {
	String actualMessage = HomeDashboardMessage.getText();
	return actualMessage;
	} 
	public void clickOnMenuByName (String menuName)  {
		for(WebElement menu:menus) {
		if( menu.getText().contains(menuName)){
			menu.click();
		}
		}
	}

	

}
