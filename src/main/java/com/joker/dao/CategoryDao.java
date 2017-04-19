/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joker.dao;

import com.joker.model.Category;
import java.util.List;
import org.springframework.data.repository.Repository;

/**
 *
 * @author bagus
 */
public interface CategoryDao extends Repository<Category, Long>{
    public List<Category> findByCategoryType(Boolean categoryType);
    public List<Category> findAll();
    
}
