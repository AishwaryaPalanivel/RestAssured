package week3.day1;

import io.restassured.RestAssured;

public class GetASingleIncidentByPathParam {

	public static void main(String[] args) {
		String url="https://dev262949.service-now.com/api/now/table/{table_name}/{sys_id}";                                      
		RestAssured.given()
		.auth()
		.basic("admin", "vW0eDfd+A0V-")
		.pathParam("table_name", "incident")
		.pathParam("sys_id", "8d6353eac0a8016400d8a125ca14fc1f")
		.log()
		.all()
		.when()
		.get(url)
		.then()
		.log()
		.all();

	}

}
