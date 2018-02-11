package com.homeShop.dao;

import com.homeShop.ConnectionUtil;
import com.homeShop.PropertiesGetSample;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Created by Gleb on 01.02.18.
 */
public class GetFirstAndLastIdImp implements GetFirstAndLastId {

    PropertiesGetSample propertiesSetSample = new PropertiesGetSample();

    Connection connection;

    public GetFirstAndLastIdImp() throws SQLException, FileNotFoundException {
        connection = ConnectionUtil.getConnection();
    }

    @Override
    public Integer getFirstElem() throws IOException, SQLException {
        Integer id = null;
        PreparedStatement ps = connection.prepareStatement(propertiesSetSample.getSample("getFirstID"));
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
          id = rs.getInt(1);
        }

        return id;
    }

    @Override
    public Integer getLastElem() throws IOException, SQLException {
        Integer id = null;
        PreparedStatement ps = connection.prepareStatement(propertiesSetSample.getSample("getLastID"));
        ResultSet rs = ps.executeQuery();

        while (rs.next()) {
            id = rs.getInt(1);
        }

        return id;
    }
}
