/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joker.service;

import com.joker.model.Menu;
import com.joker.model.Transaction;
import java.util.List;

/**
 *
 * @author bagus
 */
public interface TransactionService {
    public void createTransaction(List<Menu> Menus);
    public void updateTransaction(Transaction transaction);
    
}
