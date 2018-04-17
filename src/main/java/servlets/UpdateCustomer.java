package servlets;

import com.homeShop.customer.Customer;
import com.homeShop.dao.CustomerDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/UpdateCustomer")
public class UpdateCustomer extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{

        try {
            CustomerDaoImpl customerDao = new CustomerDaoImpl();
            req.setAttribute("cust", customerDao.get(Integer.parseInt(req.getParameter("id"))));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        req.getRequestDispatcher("/WEB-INF/UpdateCustomer.jsp").forward(req, resp);

        String firstName = req.getParameter("firstName");
        String lastName = req.getParameter("lastName");
        Integer phone = Integer.parseInt(req.getParameter("phone"));
        String eMail = req.getParameter("eMail");
        String sex = req.getParameter("sex");
        Integer address = Integer.parseInt(req.getParameter("address"));
        String password = req.getParameter("password");
        String nick = req.getParameter("nick");

        Customer customer = new Customer(firstName, lastName, phone, eMail, sex, address, password, nick);

        try {
            CustomerDaoImpl customerDao = new CustomerDaoImpl();
            customerDao.update(customer);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
