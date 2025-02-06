package week3.day1;

import io.restassured.RestAssured;

public class GetIncidentsByQuery {

	public static void main(String[] args) {
		String url="https://dev262949.service-now.com/api/now/table/incident";                                      
		RestAssured.given()
		.auth()
		.basic("admin", "vW0eDfd+A0V-")
		.queryParam("sysparm_fields", "sys_id,number,description,category,approval")
		.queryParam("sysparm_query", "category=database")
		.queryParam("sysparm_limit", 4)
		.log()
		.all()
		.when()
		.get(url)
		.then()
		.log()
		.all();


	}

}
