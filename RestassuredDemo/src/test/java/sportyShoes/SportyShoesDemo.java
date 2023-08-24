package sportyShoes;

import java.util.HashMap;

import org.junit.Assert;
import org.testng.annotations.Test;

import Restassured.RestassuredDemo.TestBase;
import io.restassured.RestAssured;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

public class SportyShoesDemo extends TestBase {
	
	JsonPath jsonPath;
	Response response;
	
	HashMap<String, String> map=new HashMap<String,String>();
	
	
	
	@Test(priority=0)
	public void getproductsDetails(){
		response=RestAssured
				.given()
					.contentType("application/json")
					.body(map)
					.when()
					.get("http://localhost:9010/get-shoes")
				.then()
					.statusCode(200)
					.extract().response();
		
		//jsonPath=response.jsonPath();
				//Assert.assertTrue(jsonPath.get("data[0].first_name").equals("Michael"));
				logger.info("Reterived Product Details");
		}
	
	@Test(priority=1)
	public void getregisteredusers(){
		response=RestAssured
				.given()
					.contentType("application/json")
					.body(map)
					.when()
					.get("http://localhost:9010/get-users")
				.then()
					.statusCode(200)
					.extract().response();
		logger.info("Reterived Registered User Details");
	}
	
	@Test(priority=2)
	public void addProduct() {
		response=RestAssured
				.given()
					.contentType("application/json")
					.body(map)
					.when()
					.post("http://localhost:9010/add-shoe?id=101&image=image_url&name=SampleShoe&category=Running&sizes=9&price=1000")
				.then()
					.statusCode(200)
					.extract().response();
		logger.info("Added Product");
}
}
