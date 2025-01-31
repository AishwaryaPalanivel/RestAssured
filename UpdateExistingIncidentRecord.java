package week2.day2;

import io.restassured.RestAssured;

public class UpdateExistingIncidentRecord {
public static void main(String[] args) {
	String updatePaylod="{\r\n"
			+" \"short_description\":\"Windows 3 box - 192.162.22.33 is not working\",\r\n\""
			+ " \"description\":\"after recent windows patch on saturday, box is not working\",\r\n"
			+"}";
	String url="https://dev262949.service-now.com/api/now/table/incident";
	RestAssured.given()
	.auth()
	.basic("admin", "vW0eDfd+A0V-")
	.header("Content-Type", "application/json")
	.log()
	.all()
	.when()
	.body(updatePaylod)
	.put(url)
	.then()
	.log()
	.all();
}
}
