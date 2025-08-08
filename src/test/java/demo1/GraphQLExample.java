package demo1;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;

public class GraphQLExample {
	
	@Test
	public void testQuery() {
		baseURI = "https://rahulshettyacademy.com/gq/graphql";
		given()
			.header("content-type","application/json")
			.body("{\"query\":\"query{\\n  character(characterId: 14864){\\n    name\\n    type\\n    status\\n    species\\n    gender\\n    location{\\n      name\\n    }\\n  }\\n}\",\"variables\":null}\r\n"
					+ "")
		.when()
			.post()
		.then()
			.assertThat()
			.statusCode(200)
			.log().all();
	}
 
}