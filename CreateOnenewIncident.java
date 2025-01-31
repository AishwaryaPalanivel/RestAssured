package week2.day2;

import io.restassured.RestAssured;

public class CreateOnenewIncident {

	public static void main(String[] args) {
		String url="https://dev262949.service-now.com/api/now/table/incident";
		String requestPayload="{\r\n"
				+" \"short_description\":\"Windows box - 192.162.22.33 is not working\",\r\n\""
				+ " \"description\":\"after recent windows patch, box is not working\",\r\n"
				+"}";
		RestAssured.given()
		.auth()
		.basic("admin", "vW0eDfd+A0V-")
		.header("Content-Type", "application/json")
		.log()
		.all()
		.when()
		.body(requestPayload)//method overloading
		.post(url)
		.then()
		.log()
		.all();

	}

}
