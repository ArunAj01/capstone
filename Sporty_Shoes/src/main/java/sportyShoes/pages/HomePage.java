package sportyShoes.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class HomePage {
	private JavascriptExecutor jse2;
	
	@FindBy(xpath="(//a[contains(@class,'btn-primary')])[1]")
	private WebElement addtocartbtn;
	
	@FindBy(linkText="Cart")
	private WebElement cartBtn;
	
	public HomePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		jse2 = (JavascriptExecutor)driver;
		}
	
	public void addToCart() throws InterruptedException{
		
		Thread.sleep(2000);
		jse2.executeScript("arguments[0].scrollIntoView();",addtocartbtn);
		jse2.executeScript("arguments[0].click()",addtocartbtn);
	}
	
	public void clickCartBtn() {
		cartBtn.click();
	}
}
