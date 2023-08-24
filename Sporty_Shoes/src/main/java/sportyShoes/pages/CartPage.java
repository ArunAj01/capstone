package sportyShoes.pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CartPage {
	private JavascriptExecutor jse2;
	

	@FindBy(xpath="//a[contains(@class,'btn-primary')]")
    private WebElement placeorderBtn;
	
	public CartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		jse2 = (JavascriptExecutor)driver;
	}

	public void clickPlaceorderBtn() throws InterruptedException {
		
		Thread.sleep(2000);
		jse2.executeScript("arguments[0].scrollIntoView();",placeorderBtn);
		jse2.executeScript("arguments[0].click()",placeorderBtn);
	}
}
