/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joker.controller;

import com.joker.service.TransactionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author bagus
 */
@RestController
@RequestMapping("/transaction")
public class TransactionController {
    public static final Logger LOGGER = LoggerFactory.getLogger(CustomerController.class);
    
    @Autowired
    TransactionService transactionService;
    
    @RequestMapping("make-payment/")
    public ResponseEntity<?> makePayment() {
        return null;
    }
    
}
