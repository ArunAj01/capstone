package sportyShoes.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlaceOrderPage {
	
	@FindBy(xpath="//*[text()[contains(., 'Message:Order Placed Successfully with ID: 7')]]")
	private WebElement placedordertext;
	
	public PlaceOrderPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String Placedordertext() {
		String text =placedordertext.getText();
		return text;
	}

}
