package dao;

import com.homeShop.customer.Customer;

import java.util.List;

/**
 * Created by Gleb on 11.11.17.
 */
public interface ControllerDao <E, K> {

    void add(E o);

    void update(E o);

    void remove(K k);

    Customer get(K k);

    List<Customer> list(E o);

}
