package edu.wctc.distjava.ch3.model;


import java.util.List;

/**
 * The general interface for all versions of OrderDAO classes.
 * 
 * @author Todd Mueller
 * @version 1.0
 */
public interface IOrderDAO {

    List<MenuItem> getCurrentMenuChoices() throws RuntimeException;

    void saveOrder(List<MenuItem> orderList) throws RuntimeException;

}
