/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joker.service;

import com.joker.model.Menu;
import java.util.List;

/**
 *
 * @author bagus
 */
public interface MenuService {
    public Menu getMenuById(String menuId);
    public List<Menu> getMenusByOutlet(String outletId);
    public List<Menu> getMenusByCategory(String categoryId);
    public List<Menu> getMenusByCategoryType(Boolean categoryType);
    public List<Menu> getMenusByName(String name);
    public void orderMenu(List<Menu> menus);
}
