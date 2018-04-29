package com.homeShop.dao;

import com.homeShop.beans.Customer;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface GenericDao<E, ID> {

    Object add(E elem);

    Object update(E elem) throws IOException, SQLException;

    void remove(ID id);

    Customer get(int id) throws SQLException, IOException;

    List<E> getAll();

}
