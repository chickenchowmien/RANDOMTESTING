package com.fourstay.stepdefinitions;

import static io.restassured.RestAssured.basePath;
import static io.restassured.RestAssured.given;
import static org.testng.Assert.assertEquals;

import java.util.Map;

import org.testng.Assert;

import cucumber.api.PendingException;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;


public class ProfileCapital {
//	String url="http://uinames.com";
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
	public void we_should_get_back_a_valid_status_code() {
	    Assert.assertEquals(200, response.getStatusCode());
	//    Assert.assertEquals(201, response.getStatusCode());

	}

	@Then("gender should be female")
	public void gender_should_be_female() {
	  Assert.assertEquals("female", map.get("gender"));
	}
}
