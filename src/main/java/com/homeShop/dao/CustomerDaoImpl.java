package com.homeShop.dao;

import com.homeShop.customer.ConnectionUtil;
import com.homeShop.customer.Customer;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


public class CustomerDaoImpl implements GenericDao {

    Connection connection;

    public CustomerDaoImpl() throws SQLException {
        connection = ConnectionUtil.getConnection();
    }

    @Override
    public Integer add(Object elem) {

        Statement stmt;

        try {
            stmt = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return null;
    }

    @Override
    public Integer update(Object elem) {
        return null;
    }

    @Override
    public void remove(Object o) {

    }

    @Override
    public Customer get(Object o) {
        return null;
    }

    @Override
    public List getAll() {
        return null;
    }
}
