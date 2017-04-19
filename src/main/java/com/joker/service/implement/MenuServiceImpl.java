/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.joker.service.implement;

import com.joker.dao.MenuDao;
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
@Service("MenuService")
@Transactional
public class MenuServiceImpl implements MenuService{

    @Autowired
    private MenuDao menuDao;
    
    @Override
    public Menu getMenuById(String menuId) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Menu> getMenusByOutlet(String outletId) {
        return menuDao.findByOutlet_Id(outletId);
    }

    @Override
    public List<Menu> getMenusByCategory(String categoryId) {
        return menuDao.findByCategory_Id(categoryId);
    }

    @Override
    public List<Menu> getMenusByName(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void orderMenu(List<Menu> menus) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Menu> getMenusByCategoryType(Boolean categoryType) {
        return menuDao.findByCategory_CategoryType(categoryType);
    }
    
}
