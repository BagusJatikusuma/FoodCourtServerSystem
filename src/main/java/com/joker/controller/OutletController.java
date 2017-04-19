/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joker.controller;

import com.joker.model.Outlet;
import com.joker.service.OutletService;
import com.joker.util.CustomErrorType;
import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author bagus
 */
@RestController
@RequestMapping("/outlet")
public class OutletController {
    public static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);
    
    @Autowired
    private OutletService outletService;
    
    @RequestMapping(value = "/get-outlets", method = RequestMethod.GET)
    public ResponseEntity<?> getOutlets() {
        LOGGER.info("fetching Outlets");
        
        List<Outlet> outlets = outletService.getOutlets();
        
        if (outlets == null) {
            LOGGER.error("Outlet not found");
            
            return new ResponseEntity(new CustomErrorType("Outlet not found"), HttpStatus.NOT_FOUND);
                    
        }
        
        return new ResponseEntity<>(outlets, HttpStatus.OK);
    }
    
}
