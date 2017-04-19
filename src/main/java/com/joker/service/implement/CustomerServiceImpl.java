/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joker.service.implement;

import com.joker.model.Customer;

import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.joker.service.CustomerService;
import com.joker.dao.CostumerDao;

/**
 *
 * @author bagus
 */
@Service("CustomerService")
@Transactional
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CostumerDao customerDao;
    
//    @Override
//    public Customer getUserByEmail(String email) {
//        return customerDao.findByEmail(email);
//    }
//
//    @Override
//    public Integer getCustomerSaldo(String idCard) {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
    
}
