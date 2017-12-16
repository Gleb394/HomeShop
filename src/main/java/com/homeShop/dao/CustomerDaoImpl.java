package com.homeShop.dao;

import com.homeShop.PropertiesSetSample;
import com.homeShop.customer.ConnectionUtil;
import com.homeShop.customer.Customer;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.List;

public class CustomerDaoImpl implements GenericDao {

    Customer customer = new Customer();

    PropertiesSetSample propertiesSetSample = new PropertiesSetSample();

    Connection connection;

    public CustomerDaoImpl() throws SQLException, FileNotFoundException {
        connection = ConnectionUtil.getConnection();
    }

    @Override
    public Object add(Object elem) {

        elem = new Customer();

        elem = customer;

        /*PreparedStatement ps;*/

        Statement stmt = null;

        try {
            /*ps = connection.prepareStatement(propertiesSetSample.setSample("addCustomerAllTable"));
            ResultSet rs = ps.executeQuery(propertiesSetSample.setSample("CustomerResultSet"));*/
            ResultSet rs = stmt.executeQuery(propertiesSetSample.setSample("addCustomerAllTable"));
            while (rs.next()){
                    customer.setFirstName(rs.getString(2));
                    customer.setLastName(rs.getNString(3));
                    customer.setPhone(rs.getInt(4));
                    customer.setEMail(rs.getString(5));
                    customer.setSex(rs.getString(6));
                    customer.setAddress(rs.getNString(7));
                    customer.setPassword(rs.getNString(8));
                    customer.setNick(rs.getNString(9));
            }
            rs.close();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return elem;
    }

    @Override
    public Integer update(Object elem) {
        return null;
    }

    @Override
    public void remove(Object o) {

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

        Customer customer = new Customer("Gleb", "Tarasevic", 939765094, "Tarasevic.Hleb@gmail.com", "Man", "Vishgorod, mazepi 10",
                "73452auo", "Glebas");

        CustomerDaoImpl customerDao = new CustomerDaoImpl();

        customerDao.add(customer);

    }
}
