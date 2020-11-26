package com.academy.rest;

import io.restassured.RestAssured;
import io.restassured.config.LogConfig;
import io.restassured.response.Response;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import static io.restassured.config.RestAssuredConfig.config;

public class SubscriberTests {


    @BeforeClass
    public void setUp() {
        RestAssured.baseURI = "http://localhost/rest/json";
        RestAssured.port = 8081;
//
//        RestAssured.config = config()
//                .logConfig(new LogConfig()
//                        .defaultStream(IoBuilder.forLogger(LOG).buildPrintStream()));
    }

    @Test
    public void testGetSubscribers(){
        Response response = RestAssured.given()
                .get("/subscribers");

        int code = response.getStatusCode();
        String body = response.getBody().print();
        int size = (int)response.getBody().path("size()");
        int id = response.getBody().path("[0].id");
        String fname = response.getBody().path("[0].firstName");
        String lname = response.getBody().path("[0].lastName");

        System.out.println(code);
        System.out.println(body);
        System.out.println(size);
        System.out.println(id);
        System.out.println(fname);
        System.out.println(lname);
    }

    @Test
    public void testAddSubscriber(){

    }
}
