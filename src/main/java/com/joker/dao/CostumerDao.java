/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joker.dao;

import com.joker.model.Customer;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author bagus
 */
public interface CostumerDao extends CrudRepository<Customer, Long> {
    /**
    * This method will find an Customer instance in the database by its email.
    * Note that this method is not implemented and its working code will be
    * automagically generated from its signature by Spring Data JPA.
     * @param email
     * @return Customer
    */
//    public Customer findByEmail(String email);
//    public Integer getSaldo(String idCard);
    
}
