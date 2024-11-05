package lk.icet.ecom.service;

import lk.icet.ecom.service.impl.ProductServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest(classes = ProductServiceTest.class)
class ProductServiceTest {

    ProductService productService = new ProductServiceImpl();

    @Test
    void test_evaluateProductRating_when90Likes(){
        String productRateings = productService.evaluateProductRating(90);

        Assertions.assertEquals("like product", productRateings);

    }
}
