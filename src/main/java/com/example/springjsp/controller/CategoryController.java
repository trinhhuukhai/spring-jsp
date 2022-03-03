package com.example.springjsp.controller;

import com.example.springjsp.models.Category;
import com.example.springjsp.repositories.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping(path = "categories") //duong dan truy cap den controller
//http:localhost:8080/categories
public class CategoryController {
    @Autowired // Dependency Injection tu dong tao ra doi tuong dung chung cho ca ://Inject "categoryRepository"
    private CategoryRepository categoryRepository;

    //return name of "jsp" file
    @RequestMapping(value = "", method = RequestMethod.GET)
    public String getAllCategories(ModelMap modelMap){
        //du lieu gui den jsp la => ModelMap : truyen tham so dang modelMap vao file jsp
        //gui data tu controller -> views

//        modelMap.addAttribute("name","khai");
        //modelMap.addAttribute("age","19");

        Iterable<Category> categories = categoryRepository.findAll();
        modelMap.addAttribute("categories",categories);
        return "category";
    }


}
