package week2.day2;

import io.restassured.RestAssured;

public class AsserrtheStatusCode {

	public static void main(String[] args) {
		String url="https://dev262949.service-now.com/api/now/table/incident";                                      
		RestAssured.given()
		.auth()
		.basic("admin", "vW0eDfd+A0V-")
		.log()
		.all()
		.when()
		.delete(url)
		.then()
		.assertThat()
		.statusCode(454);


	}

}
