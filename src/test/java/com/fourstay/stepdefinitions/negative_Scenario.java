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

public class negative_Scenario {
	Map map;
	Response response;
	
	@When("we send a request for zero names")
	public void we_send_a_request_for_zero_names() {
		basePath="http://uinames.com";
		response = given().accept(ContentType.JSON)
				.and().params("amount", 0,"region","United States")
				.when().get(basePath+"/api/");
		
		map  = response.as(Map.class);
	}

	@Then("we should get back bad status code")
	public void we_should_get_back_bad_status_code() {
	  assertEquals(400, response.getStatusCode());
	}

	@Then("error messsage should say Amount of requested names exceeds maximum allowed")
	public void error_messsage_should_say_Amount_of_requested_names_exceeds_maximum_allowed() {
		String error="Amount of requested names exceeds maximum allowed";
		Assert.assertEquals(map.get("error"), error);
		
	}

}
