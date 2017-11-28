package com.homeShop.dao;

import com.homeShop.customer.Customer;

import java.util.List;

public interface GenericDao<E, ID> {

    Integer add(E elem);

    Integer update(E elem);

    void remove(ID id);

    Customer get(ID id);

    List<E> getAll();

}
