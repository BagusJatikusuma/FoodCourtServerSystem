/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joker.service.implement;

import com.joker.dao.TransactionDao;
import com.joker.model.Menu;
import com.joker.model.Transaction;
import com.joker.service.TransactionService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author bagus
 */
@Service("TransactionService")
@Transactional
public class TransactionServiceImpl implements TransactionService {

    @Autowired
    private TransactionDao transactionDao;
    
    @Override
    public void createTransaction(List<Menu> Menus) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void updateTransaction(Transaction transaction) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
