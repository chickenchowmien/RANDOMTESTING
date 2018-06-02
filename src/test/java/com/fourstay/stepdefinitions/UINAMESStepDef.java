package com.fourstay.stepdefinitions;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.path.json.JsonPath;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;

import org.testng.Assert;


import com.gargoylesoftware.htmlunit.javascript.host.Map;


public class UINAMESStepDef {
	Map map;
	Response response;
	@When("we send a request for a user name")
	public void we_send_a_request_for_a_user_name() {
	    RestAssured.basePath="https://uinames.com/api/";//
	    response =
	    		given().accept(ContentType.JSON)
	    		.and().params("amount", 1,"gender","female", "region", "United States")
	    		.when().get(RestAssured.basePath);
	   // JsonPath path = response.jsonPath();
	    //after this line, DESERIALIZATION
	    //List list = path.getList();
	    	    
	    map = response.as(Map.class);

	    
	}

	@Then("we should get back a good status code")
	public void we_should_get_back_a_good_status_code() {
		Assert.assertEquals(200, response.getStatusCode());

	}

	@And("the gender should be female")
	public void the_gender_should_be_female() {
	  Assert.assertEquals("female", map.get("gender"));
	}

}
