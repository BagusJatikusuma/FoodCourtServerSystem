/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joker.service.implement;

import com.joker.dao.CategoryDao;
import com.joker.model.Category;
import com.joker.model.Menu;
import com.joker.service.MenuService;
import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author bagus
 */
@Service("CategoryService")
@Transactional
public class CategoryServiceImpl implements com.joker.service.CategoryService{
    
    @Autowired
    private CategoryDao categoryDao;

    @Override
    public List<Category> getCategories() {
        return categoryDao.findAll();
    }

    @Override
    public List<Category> getCategoriesByCategoryType(Boolean categoryType) {
        return categoryDao.findByCategoryType(categoryType);
    }
    
}
