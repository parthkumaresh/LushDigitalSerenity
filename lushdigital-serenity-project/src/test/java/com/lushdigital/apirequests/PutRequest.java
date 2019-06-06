package com.lushdigital.apirequests;

import com.lushdigital.model.ProductPojo;
import com.lushdigital.testbase.TestBase;
import net.thucydides.core.annotations.Title;
import org.junit.Test;

import static net.serenitybdd.rest.SerenityRest.given;

public class PutRequest extends TestBase {


    @Title("Update Product")
    @Test
    public void updateProduct() {
        ProductPojo productPojo = new ProductPojo();
        productPojo.setName("Orange Curd");
        productPojo.setAvailable(220);

        given().header("Content-Type", "application/json")
                .when()
                .body(productPojo)
                .put("/products/2")
                .then()
                .statusCode(200);
    }
}


