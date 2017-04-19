/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joker.dao;

import com.joker.model.Transaction;

import java.io.Serializable;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author bagus
 */
public interface TransactionDao extends CrudRepository<Transaction, Serializable>{
//    public void saveTransaction(Transaction transaction);
//    public void update(Transaction transaction);
    
}
