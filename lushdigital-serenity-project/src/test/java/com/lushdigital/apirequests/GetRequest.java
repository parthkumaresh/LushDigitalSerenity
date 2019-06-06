package com.lushdigital.apirequests;

import com.lushdigital.testbase.TestBase;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.rest.SerenityRest;
import net.thucydides.core.annotations.Title;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(SerenityRunner.class)
public class GetRequest extends TestBase {

        @Title("Get All Products")
        @Test
        public void getAllProducts(){
            SerenityRest.given()
                    .when()
                    .get("/products")
                    .then()
                    .statusCode(200).log().all();
        }

        @Title("Get Product By ID")
        @Test
        public void getProductByID(){
            SerenityRest.given()
                    .when()
                    .get("/products/1")
                    .then()
                    .statusCode(200).log().all();
        }
    }

