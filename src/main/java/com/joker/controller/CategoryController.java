/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joker.controller;

import com.joker.model.Category;
import com.joker.model.Menu;
import com.joker.service.CategoryService;
import com.joker.util.CustomErrorType;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author bagus
 */
@RestController
@RequestMapping("/category")
public class CategoryController {
    public static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);
    
    @Autowired
    private CategoryService categoryService;
    
    @RequestMapping(value = "/get-categories",method = RequestMethod.GET)
    public ResponseEntity<?> getListCategory() {
        LOGGER.info("fetching categories");
        
        List<Category> categories = categoryService.getCategories();
        
        if (categories == null) {
            LOGGER.error("categories not found");
            
            return new ResponseEntity(new CustomErrorType("category not found"), HttpStatus.NOT_FOUND);
            
        }
        
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/get-categories-by-type/{type}", method = RequestMethod.GET)
    public ResponseEntity<?> getCategoriesByTipeKategori(@PathVariable("type") Boolean type) {
        LOGGER.info("fetching categories with "+type.toString()+" type");
        
        List<Category> categories = categoryService.getCategoriesByCategoryType(type);
        
        if (categories == null) {
            LOGGER.error("categories with "+type.toString()+" type not found");
            
            return new ResponseEntity(new CustomErrorType("category not found"), HttpStatus.NOT_FOUND);
            
        }
        
        return new ResponseEntity<>(categories, HttpStatus.OK);
    }
    
}
