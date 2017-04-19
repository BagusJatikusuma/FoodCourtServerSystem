/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joker.service.implement;

import com.joker.dao.MenuDao;
import com.joker.dao.OutletDao;
import com.joker.model.Menu;
import com.joker.model.Outlet;
import com.joker.service.OutletService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author bagus
 */
@Service("OutletService")
@Transactional
public class OutletServiceImpl implements OutletService {

    @Autowired
    private OutletDao outletDao;
   
    @Override
    public List<Outlet> getOutlets() {
        return outletDao.findAll();
    }
    
}
