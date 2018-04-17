package com.homeShop.dao;

import com.homeShop.PropertiesGetSample;
import com.homeShop.ConnectionUtil;
import com.homeShop.customer.Customer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDaoImpl implements GenericDao<Customer, Integer> {

    private PropertiesGetSample propertiesSetSample = new PropertiesGetSample();
    private Connection connection;

    public CustomerDaoImpl() throws SQLException, FileNotFoundException {
        connection = ConnectionUtil.getConnection();
    }

    @Override
    public Customer add(Customer customer) {
        PreparedStatement addCustomer;

        try {
            addCustomer = connection.prepareStatement(propertiesSetSample.getSample("addCustomer"));
            connection.setAutoCommit(false);
            addCustomer.setString(1, customer.getFirstName());
            addCustomer.setString(2, customer.getLastName());
            addCustomer.setInt(3, customer.getPhone());
            addCustomer.setString(4, customer.getEMail());
            addCustomer.setString(5, customer.getSex());
            addCustomer.setInt(6, customer.getAddress());
            addCustomer.setString(7, customer.getPassword());
            addCustomer.setString(8, customer.getNick());
            addCustomer.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return customer;
    }

    @Override
    public Customer update(Customer customer) throws IOException, SQLException {
        PreparedStatement updateCustomer;
        updateCustomer = connection.prepareStatement(propertiesSetSample.getSample("updateCustomer"));
        connection.setAutoCommit(false);

        updateCustomer.setString(1, customer.getFirstName());
        updateCustomer.setString(2, customer.getLastName());
        updateCustomer.setInt(3, customer.getPhone());
        updateCustomer.setString(4, customer.getEMail());
        updateCustomer.setString(5, customer.getSex());
        updateCustomer.setInt(6, customer.getAddress());
        updateCustomer.setString(7, customer.getPassword());
        updateCustomer.setString(8, customer.getNick());
        updateCustomer.executeUpdate();
        connection.commit();
        return customer;
    }

    @Override
    public void remove(Integer id) {
        PreparedStatement removeCustomer;
        try {
            removeCustomer = connection.prepareStatement(propertiesSetSample.getSample("removeCustomer"));
            removeCustomer.setInt(1, id);
            removeCustomer.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Customer get(int id) throws SQLException, IOException {
        Customer customer = new Customer();
        PreparedStatement getCustomer;
        getCustomer = connection.prepareStatement(propertiesSetSample.getSample("getCustomer"));
        getCustomer.setInt(1, id);
        ResultSet rs = getCustomer.executeQuery();

        while (rs.next()) {
            customer.setId(rs.getInt(1));
            customer.setFirstName(rs.getString(2));
            customer.setLastName(rs.getString(3));
            customer.setPhone(rs.getInt(4));
            customer.setEMail(rs.getString(5));
            customer.setSex(rs.getString(6));
            customer.setAddress(rs.getInt(7));
            customer.setPassword(rs.getString(8));
            customer.setNick(rs.getString(9));
        }
        return customer;
    }

    @Override
    public List<Customer> getAll() {
        List<Customer> list = new ArrayList<Customer>();
        Statement stmt;

        try {
            stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(propertiesSetSample.getSample("getAllCustomer"));
            while (rs.next()) {
                Customer customer = new Customer();
                customer.setId(rs.getInt(1));
                customer.setFirstName(rs.getString(2));
                customer.setLastName(rs.getString(3));
                customer.setPhone(rs.getInt(4));
                customer.setEMail(rs.getString(5));
                customer.setSex(rs.getString(6));
                customer.setAddress(rs.getInt(7));
                customer.setPassword(rs.getString(8));
                customer.setNick(rs.getString(9));
                list.add(customer);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;
    }
}
