package week3.day1;

import java.io.File;

import groovy.lang.Newify;
import io.restassured.RestAssured;

public class CreatenewIncident {

	public static void main(String[] args) {
		String url="https://dev241313.service-now.com/api/now/table/incident";
		
		RestAssured.given()
		.auth()
		.basic("admin", "zZsh$F0bDM4/")
		.header("Content-Type", "application/json")
		.log()
		.all()
		.when()
		.body(new File("src/main/resources/request-payload/create-incident.json"))//method overloading
		.post(url)
		.then()
		.log()
		.all()
		.assertThat()
		.statusCode(200);

	}

	}


