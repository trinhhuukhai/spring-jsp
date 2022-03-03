package com.example.springjsp.controller;

import com.example.springjsp.models.Category;
import com.example.springjsp.models.Product;
import com.example.springjsp.repositories.CategoryRepository;
import com.example.springjsp.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = "products") //duong dan truy cap den controller
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @RequestMapping(value = "/getProductByCatID/{categoryID}" , method = RequestMethod.GET)
    public String getProductsByCategoryID(ModelMap modelMap, @PathVariable String categoryID){
        Iterable<Product> products = productRepository.findByCategoryID(categoryID);
        modelMap.addAttribute("products",products);
        return "productList";
    }

    //products/changeCategory/${product.getProductID()}
    @RequestMapping(value = "/changeCategory/{productID}", method = RequestMethod.GET)
    public String changeCategory(ModelMap modelMap, @PathVariable String productID){
        Iterable<Category> categories = categoryRepository.findAll();
        modelMap.addAttribute("categories",categories);
        return "abc";
    }
}
