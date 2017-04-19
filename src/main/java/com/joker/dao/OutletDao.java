/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joker.dao;

import com.joker.model.Outlet;
import com.joker.model.Customer;
import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author bagus
 */
public interface OutletDao extends Repository<Outlet, Long> {
    public List<Outlet> findAll();
    
}
