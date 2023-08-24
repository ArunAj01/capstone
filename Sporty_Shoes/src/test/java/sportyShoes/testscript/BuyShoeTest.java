package sportyShoes.testscript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import sportyShoes.pages.AddToCartPage;
import sportyShoes.pages.CartPage;
import sportyShoes.pages.HomePage;
import sportyShoes.pages.LandingPage;
import sportyShoes.pages.LogoutPage;
import sportyShoes.pages.PlaceOrderPage;
import sportyShoes.pages.RegisterPage;

public class BuyShoeTest {
	
	WebDriver driver;
	
	@BeforeTest
	public void launchApplication() {
		
		//open the browser
		driver=new ChromeDriver();
		
		//maximize it
		driver.manage().window().maximize();
		
		//Navigate to http://localhost:9010/
		driver.get("http://localhost:9010/");
	}
	
	@Test
	public void buyShoe() throws InterruptedException {
		
		//click on register
		LandingPage landingPage=new LandingPage(driver);
		landingPage.clickRegister();
		
		//Enter the details
		RegisterPage registerPage=new RegisterPage(driver);
		registerPage.enterName();
		
		
		registerPage.enterEmail();
		registerPage.enterPassword();
		registerPage.clickRegisterBtn();
		
		//click on logout
		LogoutPage logoutPage=new LogoutPage(driver);
		logoutPage.clickLogout();
		
		//click on login
		landingPage.enterEmail();
		landingPage.enterPassword();
		landingPage.clickLoginBtn();
		
		//add product to the cart
		HomePage homePage=new HomePage(driver);
		homePage.addToCart();
		
		
		//verify the cart msg
		AddToCartPage addToCartPage=new AddToCartPage(driver);
		String expectedText="Message:Shoe SampleShoe Added Successfully to Cart";
		String actualText=addToCartPage.verifyCartText();
		Assert.assertEquals(actualText, expectedText);
		
		//click on home 
		addToCartPage.clickHomeBtn();
		
		//go to cart 
		homePage.clickCartBtn();
		
		//on cart page click placeorder
		CartPage cartPage=new CartPage(driver);
		cartPage.clickPlaceorderBtn();
		
		
		//verify text in place order page
		PlaceOrderPage placeOrderPage=new PlaceOrderPage(driver);
		String expectedText1="Message:Order Placed Successfully with ID: 7";
		String actualText1=placeOrderPage.Placedordertext();
		Assert.assertEquals(actualText1, expectedText1);
	}
	
	@AfterTest
	public void closeBrowser() {
		driver.close();
	}

}
