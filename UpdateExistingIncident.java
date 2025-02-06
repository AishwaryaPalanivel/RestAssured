package week3.day1;

import java.io.File;

import io.restassured.RestAssured;

public class UpdateExistingIncident {

	public static void main(String[] args) {
		String url="https://dev241313.service-now.com/api/now/table/incident/f7f5e504832bd210695bc7b6feaad348";

		RestAssured.given()
		.auth()
		.basic("admin", "zZsh$F0bDM4/")
		.header("Content-Type", "application/json")
		.log()
		.all()
		.when()
		.body(new File("src/main/resources/request-payload/update-incident.json"))//method overloading
		.put(url)
		.then()
		.log()
		.all()
		.assertThat()
		.statusCode(200);

	}

}


