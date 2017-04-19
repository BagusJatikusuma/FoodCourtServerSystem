/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joker.controller;

import com.joker.model.Menu;
import com.joker.service.MenuService;
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
@RequestMapping("/menu")
public class MenuController {
    public static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);
    
    @Autowired
    private MenuService menuService;
    
    @RequestMapping(value = "/get-menus-by-category/{idCategory}", method = RequestMethod.GET)
    public ResponseEntity<?> getMenusByCategoryId(@PathVariable("idCategory") String idCategory) {
        LOGGER.info("fetching menus with "+idCategory);
        
        List<Menu> menus = menuService.getMenusByCategory(idCategory);
        
        if (menus == null) {
            LOGGER.error("menus with "+idCategory+" not found");
            
            return new ResponseEntity(new CustomErrorType("menus not found"), HttpStatus.NOT_FOUND);
            
        }
        
        return new ResponseEntity<>(menus, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/get-menus-by-type/{type}", method = RequestMethod.GET)
    public ResponseEntity<?> getMenusByCategoryType(@PathVariable("type") Boolean categoryType) {
        LOGGER.info("fetching menus with "+categoryType.toString()+" type");
        
        List<Menu> menus = menuService.getMenusByCategoryType(categoryType);
        
        if (menus == null) {
            LOGGER.error("menus with "+categoryType.toString()+" not found");
            
            return new ResponseEntity(new CustomErrorType("menus not found"), HttpStatus.NOT_FOUND);
            
        }
        
        return new ResponseEntity<>(menus, HttpStatus.OK);
    }
    
    @RequestMapping(value = "/get-menus-by-outlet/{outletId}", method = RequestMethod.GET)
    public ResponseEntity<?> getMenusByOutlet(@PathVariable("outletId") String outletId) {
        LOGGER.info("fetching menus with Outlets "+outletId);
        
        List<Menu> menus = menuService.getMenusByOutlet(outletId);
        
        if (menus == null) {
            LOGGER.error("menus with outlet "+outletId+" not found");
            
            return new ResponseEntity<>(new CustomErrorType("menus with outlet "+outletId+" not found"), HttpStatus.NOT_FOUND);
        }
        
        return new ResponseEntity<>(menus, HttpStatus.OK);
        
    }
    
}
