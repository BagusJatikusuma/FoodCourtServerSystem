/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joker.controller;

import com.joker.model.Customer;
import com.joker.util.CustomErrorType;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import com.joker.service.CustomerService;
import com.joker.dao.CostumerDao;

/**
 *
 * @author bagus
 */
@RestController
@CrossOrigin
@RequestMapping("/customer")
public class CustomerController {
    public static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);
    
    @Autowired
    private CustomerService customerService;
    
//    @RequestMapping(value = "/get-user-by-email/{email}", method = RequestMethod.GET)
//    public ResponseEntity<?> getUserByEmail(@PathVariable("email") String email) {
//        LOGGER.info("Fetching User with email {}", email);
//        
//        Customer user = customerService.getUserByEmail("jatikusuma0801@gmail.com");
//        
//        if (user == null) {
//            LOGGER.error("User with id {} not found.", email);
//            return new ResponseEntity(new CustomErrorType("User with email " + email 
//                    + " not found"), HttpStatus.NOT_FOUND);
//        }
//        
//        return new ResponseEntity<>(user, HttpStatus.OK);
//        
//    }

}
