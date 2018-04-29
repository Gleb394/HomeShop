package servlets;

import com.homeShop.beans.Customer;
import com.homeShop.dao.CustomerDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/addCustomer")
public class AddCustomer extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("/WEB-INF/addCustomer.jsp").forward(request, response);

        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        Integer phone = Integer.parseInt(request.getParameter("phone"));
        String eMail = request.getParameter("eMail");
        String sex = request.getParameter("sex");
        Integer address = Integer.parseInt(request.getParameter("address"));
        String password = request.getParameter("password");
        String nick = request.getParameter("nick");

        Customer customer = new Customer(firstName, lastName, phone, eMail, sex, address, password, nick);

        try {
            CustomerDaoImpl customerDao = new CustomerDaoImpl();
            customerDao.add(customer);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
