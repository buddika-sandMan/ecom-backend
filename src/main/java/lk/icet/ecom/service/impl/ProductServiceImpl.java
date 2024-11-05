package lk.icet.ecom.service.impl;

import lk.icet.ecom.service.ProductService;
import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {
    public String evaluateProductRating(int numberOfLikes) {
        if(numberOfLikes > 90) {
            return "Very like product";
        }
        if(numberOfLikes > 70) {
            return "like product";
        }
        if(numberOfLikes > 40) {
            return "good product";
        }
        if(numberOfLikes > 10) {
            return "standard product";
        }
        return "not rated product";
    }
}
