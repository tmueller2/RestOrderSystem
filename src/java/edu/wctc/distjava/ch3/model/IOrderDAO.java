package edu.wctc.distjava.ch3.model;

import java.awt.MenuItem;
import java.util.List;

/**
 * The general contract for all versions of OrderDAO classes.
 * 
 * @author jlombardo
 */
public interface IOrderDAO {

    List<MenuItem> getCurrentMenuChoices() throws RuntimeException;

    void saveOrder(List<MenuItem> orderList) throws RuntimeException;

}
