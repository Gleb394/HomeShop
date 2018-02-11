package com.homeShop.dao;

import com.homeShop.customer.Customer;
import org.junit.Assert;
import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Gleb on 30.01.18.
 */
public class TestCustomerDaoImpl {

    private Customer newCustomer = new Customer("Max", "Tom", 986594539, "Tom_titan@gmail.com", "Man", 1,
            "52364xcc", "MaxTom");
    private Customer updateCustomer = new Customer("Xoxox");
    private CustomerDaoImpl customerDao = new CustomerDaoImpl();
    private GetFirstAndLastIdImp getFirstAndLastIdImp;
    private int size;
    private int sizeAfter;

    public TestCustomerDaoImpl() throws FileNotFoundException, SQLException {
    }

    @Test
    public void addCustomer (){
        size = customerDao.getAll().size();
        customerDao.add(newCustomer);
        sizeAfter = customerDao.getAll().size();
        Assert.assertNotEquals(size, sizeAfter);
    }

    @Test
    public void updateCustomer(){

    }

    @Test
    public void removeCustomer () throws IOException, SQLException {
        size = customerDao.getAll().size();
        customerDao.remove(getFirstAndLastIdImp.getLastElem());
        sizeAfter = customerDao.getAll().size();
        Assert.assertNotEquals(size, sizeAfter);
    }
}
