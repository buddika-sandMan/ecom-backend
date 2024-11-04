package lk.icet.ecom.controller;

import lk.icet.ecom.model.Product;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


//@Component - create and destroy the object of the product controller(manage the complete life cycle)
//@ResponseBody - return  only json output
//@Controller - (resolve the incoming network request)we can return html, xml like out puts then use @ResponseBody with API
@RestController
//@Controller - if you use @Controller instead of @RestController the you use @ResponseBody
public class ProductController {

    @PostMapping("/save-product") //controller methods
    public void saveProduct(@RequestBody Product product) {//handler methods

    }
}
