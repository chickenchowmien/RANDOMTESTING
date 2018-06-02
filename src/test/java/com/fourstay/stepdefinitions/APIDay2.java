package com.fourstay.stepdefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.Map;

import org.testng.Assert;

public class APIDay2 {
	Map map;
	Response response;

@When("the user sends request for a female name")
public void the_user_sends_request_for_a_female_name() {
	basePath="http://uinames.com";
	 response = given().accept(ContentType.JSON)
			.and().params("amount", 1,"gender","female","region","United States")
			.when().get(basePath+"/api/");
//	JsonPath path = response.jsonPath();
	map = response.as(Map.class);//desearlizing
   Assert.assertEquals(200, response.getStatusCode());

}

@Then("we should get back a valid status code")
public void we_should_get_back_a_valid_status_code1() {
	Assert.assertEquals(200, response.getStatusCode());
}

@Then("gender should be female")
public void gender_should_be_female() {
  Assert.assertEquals("female",map.get("gender"));
}







}
