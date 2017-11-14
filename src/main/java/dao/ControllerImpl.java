package dao;

import com.homeShop.customer.Customer;
import com.homeShop.customer.HomeShopConnection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;


public class ControllerImpl implements ControllerDao {

    String insert = "INSERT INTO Customer VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?)";

    String quvery = "SELECT * FROM Customer";

    Statement statement = homeShopConnection.getConnection().createStatement();

    HomeShopConnection homeShopConnection = new HomeShopConnection();

    PreparedStatement preparedStatement = homeShopConnection.getConnection().prepareStatement(insert);

    public ControllerImpl() throws SQLException {
    }

    @Override
    public void add(Object o) {
    }

    @Override
    public void update(Object o) {

    }

    @Override
    public void remove(Object o) {

    }

    @Override
    public Customer get(Object o) {
        return null;
    }

    @Override
    public List<Customer> list(Object o) {
        return null;
    }

}
