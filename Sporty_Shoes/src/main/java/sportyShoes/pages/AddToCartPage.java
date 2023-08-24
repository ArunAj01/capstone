package sportyShoes.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AddToCartPage {

	@FindBy(xpath="//*[text()[contains(., 'Message:Shoe SampleShoe Added Successfully to Cart')]]")
	private WebElement carttext;
	
	@FindBy(linkText="Home")
	private WebElement homeBtn;
	
	public AddToCartPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public String verifyCartText() {
		String text =carttext.getText();
		return text;
	}
	
	public void clickHomeBtn() {
		homeBtn.click();
	}
	
	
}
