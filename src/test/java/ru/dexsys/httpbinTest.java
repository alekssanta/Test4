package ru.dexsys;

import io.restassured.RestAssured;
import org.junit.Test;


public class httpbinTest {

    private int statusNumber;
    private static String Uri, Path;

    @Test
    public void Test1(){
        Uri="http://httpbin.org/";
        Path=("status/");
        statusNumber= 200;

        RestAssured.given()

               .baseUri(Uri)
                .basePath(Path + statusNumber)
           //.basePath("status/"+ s1)
//.header("api_key","2232323")
//                .body("{\n" +   // пусть будет боди, для дальнейших тестов
//                     "\"id\": "+ 4534543 +",\n" +
//                        "\"name\":\"rererere\",\n" +
//                        "\"photoUrls\":[],\n" +
//                        "\"tags\": [],\n" +
//                        "\"status\":\"pending\"\n" +
//                        "}")
.when().post(Uri+Path+statusNumber)
                .then()
        .statusCode(statusNumber);








    }
}

//    val response = khttp.get(url = "http://httpbin.org")
//if(response.statusCode == 200) {
//        process(response)
//        } else {
//        handleError(response)
//        }