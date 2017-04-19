/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joker.service;

import com.joker.model.Category;
import com.joker.model.Menu;
import java.util.List;

/**
 *
 * @author bagus
 */
public interface CategoryService {
    public List<Category> getCategories();
    public List<Category> getCategoriesByCategoryType(Boolean categoryType);
}
