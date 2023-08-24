package sportyShoes.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {

	
	@FindBy(id="name")
	private WebElement name;

	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(id="password")
	private WebElement password;
	
	@FindBy(xpath="//button[contains(@class,'btn-primary')]")
	private WebElement registerbtn;
	
	public RegisterPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void enterName() {
		name.sendKeys("ArunAJ");
	}
	
	public void enterEmail() {
		email.sendKeys("Arun123@gmail.com");
	}
	
	public void enterPassword() {
		password.sendKeys("Arun143");
	}
	
	public void clickRegisterBtn() {
		registerbtn.click();
	}
}
