package com.lushdigital.apirequests;

import com.lushdigital.testbase.TestBase;
import net.thucydides.core.annotations.Title;
import org.junit.Test;

import static net.serenitybdd.rest.SerenityRest.given;

public class DeleteRequest extends TestBase {


        @Title("Delete Product By ID")
        @Test
        public void deleteProductByID() {
            given()
                    .when()
                    .delete("products/1")
                    .then()
                    .log().all()
                    .statusCode(200);
        }

        @Title("Verify That Product is deleted")
        @Test
        public void verifyThatProductIsDeleted() {
            given()
                    .when()
                    .get("products/1")
                    .then()
                    .log().all()
                    .statusCode(404);
        }
    }

