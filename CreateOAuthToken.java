package week3.day1;

import static io.restassured.RestAssured.*;

public class CreateOAuthToken {

	public static void main(String[] args) {
		String url="https://dev241313.service-now.com/oauth_token.do";
		String access_token=given()
		.header("Content-Type", "application/x-www-form-urlencoded")
		.formParam("grant_type", "password")
		.formParam("client_id", "f9707fb532234df4826c2fa9a5804862")
		.formParam("client_secret", "SjKk!x5v,^")
		.formParam("username", "admin")
		.formParam("password", "zZsh$F0bDM4/")
		.when()
		.post(url)
		.then()
		.log()
		.all()
		.extract()
		.jsonPath()
		.getString("access_token");
		System.out.println("OAuth access token: "+access_token);

	}

}
