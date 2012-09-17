package edu.wctc.distjava.ch3.model;

import java.util.*;

/**
 * This service class decouples the controller code from the data access code.
 * The advantage is that we can change what we access without breaking
 * anything. For example, here we can switch between production and development
 * databases.
 * 
 * @author jlombardo
 */
public class OrderService {
    private List<java.awt.MenuItem> menuList;
    private List<java.awt.MenuItem> orderList;
    private IOrderDAO orderDao;

    public OrderService() {
        initItemsDb();
    }

    private void initItemsDb() {
        orderDao = new OrderDAODevelopement();
        //orderDao = new OrderDAOProduction();
        menuList = orderDao.getCurrentMenuChoices();
        orderList = new ArrayList<java.awt.MenuItem>();
    }
    
    public void placeOrder() {
        orderDao.saveOrder(orderList);
    }

    public List<java.awt.MenuItem> getMenuList() {
        return menuList;
    }

    public void setMenuList(List<java.awt.MenuItem> menuList) {
        this.menuList = menuList;
    }

    public List<java.awt.MenuItem> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<java.awt.MenuItem> orderList) {
        this.orderList = orderList;
    }

    public IOrderDAO getOrderDao() {
        return orderDao;
    }

    public void setOrderDao(IOrderDAO orderDao) {
        this.orderDao = orderDao;
    }

}
