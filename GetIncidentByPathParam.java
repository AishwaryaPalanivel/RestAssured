package week3.day1;

import io.restassured.RestAssured;

public class GetIncidentByPathParam {

	public static void main(String[] args) {
		String url="https://dev262949.service-now.com/api/now/table/{table_name}";                                      
		RestAssured.given()
		.auth()
		.basic("admin", "vW0eDfd+A0V-")
		.pathParam("table_name", "incident")
		.queryParam("sysparm_fields", "sys_id,number,description,category,approval")
		.queryParam("sysparm_query", "category=database")
		.queryParam("sysparm_limit", 2)
		.log()
		.all()
		.when()
		.get(url)
		.then()
		.log()
		.all();

	}

}
