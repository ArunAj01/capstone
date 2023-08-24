package sportyShoes.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	@FindBy(linkText="New User? Register Here")
	private WebElement register;
	
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(xpath="//button[contains(@class,'btn-primary')]")
	private WebElement loginbtn;

	public LandingPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void clickRegister() {
		register.click();
	}
	
	public void enterEmail() {
		email.sendKeys("Arun123@gmail.com");
	}
	
	public void enterPassword() {
		password.sendKeys("Arun143");
	}
	
	public void clickLoginBtn() {
		loginbtn.click();
	}
}
