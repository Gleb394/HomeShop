package com.homeShop.dao;

import com.homeShop.PropertiesSetSample;
import com.homeShop.customer.ConnectionUtil;
import com.homeShop.customer.Customer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CustomerDaoImpl implements GenericDao<Customer, Integer> {

    PropertiesSetSample propertiesSetSample = new PropertiesSetSample();

    Connection connection;

    public CustomerDaoImpl() throws SQLException, FileNotFoundException {
        connection = ConnectionUtil.getConnection();
    }

    @Override
    public Customer add(Customer customer) {

        PreparedStatement ps;

        try {
            ps = connection.prepareStatement(propertiesSetSample.setSample("addCustomer"));
            connection.setAutoCommit(false);

            ps.setString(1, customer.getFirstName());
            ps.setString(2, customer.getLastName());
            ps.setInt(3, customer.getPhone());
            ps.setString(4, customer.getEMail());
            ps.setString(5, customer.getSex());
            ps.setInt(6, customer.getAddress());
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
    public Integer update(Customer customer, Integer id) {

        Statement stmt;

        PreparedStatement ps;

        try {
            /*stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery("getCustomerID" + id);*/

        ps = connection.prepareStatement(propertiesSetSample.setSample("updateCustomer"));
            connection.setAutoCommit(false);

            ps.setString(2, customer.getFirstName());
            ps.setString(3, customer.getLastName());
            ps.setInt(4, customer.getPhone());
            ps.setString(5, customer.getEMail());
            ps.setString(6, customer.getSex());
            ps.setInt(7, customer.getAddress());
            ps.setString(8, customer.getPassword());
            ps.setString(9, customer.getNick());


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return id;
    }

    @Override
    public void remove(Integer id) {

        PreparedStatement ps;

        try {
            ps = connection.prepareStatement(propertiesSetSample.setSample("removeCustomer"));
            ps.setInt(1,id);
            ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public Customer get(int id) throws SQLException, IOException {

        String stringId = String.valueOf(id);

        Customer customer = new Customer();

        Statement stmt;
        stmt = connection.createStatement();
        ResultSet rs = stmt.executeQuery(propertiesSetSample.setSample("getCustomerID") + stringId);

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
    public List getAll() {

        List<Customer> list = new ArrayList<Customer>();

        Statement stmt;

        try {

        stmt = connection.createStatement();
            ResultSet rs = stmt.executeQuery(propertiesSetSample.setSample("getAllCustomer"));

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

    public static void main(String[] args) throws FileNotFoundException, SQLException {

        Customer customer = new Customer("Max", "Tom", 986594539, "Tom_titan@gmail.com", "Man", 1,
                "52364xcc", "MaxTom");
        Customer customer1 = new Customer("Xoxox");

        /*System.out.println(customer.toString());*/

        CustomerDaoImpl customerDao = new CustomerDaoImpl();

        //customerDao.update(customer1, 6);
            //System.out.println(customerDao.getAll());

        customerDao.remove(7);
    }
}
