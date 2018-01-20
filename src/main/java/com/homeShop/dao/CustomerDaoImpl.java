package com.homeShop.dao;

import com.homeShop.PropertiesSetSample;
import com.homeShop.customer.ConnectionUtil;
import com.homeShop.customer.Customer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.List;

public class CustomerDaoImpl implements GenericDao<Customer, Integer> {

    PropertiesSetSample propertiesSetSample = new PropertiesSetSample();

    Connection connection;

    public CustomerDaoImpl() throws SQLException, FileNotFoundException {
        connection = ConnectionUtil.getConnection();
    }

    @Override
    public Customer add(Customer customer) {

        customer = new Customer();
        PreparedStatement ps;

        try {
            ps = connection.prepareStatement(propertiesSetSample.setSample("addCustomer"));
            connection.setAutoCommit(false);

            ps.setString(1, customer.getFirstName());
            ps.setString(2, customer.getLastName());
            ps.setInt(3, customer.getPhone());
            ps.setString(4, customer.getEMail());
            ps.setString(5, customer.getSex());
            ps.setString(6, customer.getAddress());
            ps.setString(7, customer.getPassword());
            ps.setString(8, customer.getNick());

            ps.executeUpdate();
            connection.commit();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return customer;
    }

    @Override
    public Integer update(Customer elem) {
        return null;
    }

    @Override
    public void remove(Integer o) {

    }

    @Override
    public Customer get(int o) throws SQLException, IOException {

        Statement stmt;
        stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery("getCustomer");
        ResultSetMetaData rsmd = rs.getMetaData();

        for (int i = 1; i <= o; i++ ) {
            String name = rsmd.getColumnName(i);
        }


        return null;
    }

    @Override
    public List getAll() {
        return null;
    }

    public static void main(String[] args) throws FileNotFoundException, SQLException {

        Customer customer = new Customer("Max", "Tom", 986594539, "Tom_titan@gmail.com", "Man", "Vishgorod, mazepi 10",
                "52364xcc", "MaxTom");

        /*System.out.println(customer.toString());*/

        CustomerDaoImpl customerDao = new CustomerDaoImpl();

        customerDao.add(customer);
    }
}
