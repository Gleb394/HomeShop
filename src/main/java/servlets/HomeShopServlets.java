package servlets;

import com.homeShop.dao.CustomerDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/HomeShop")
public class HomeShopServlets extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


        try {
            CustomerDaoImpl customerDao = new CustomerDaoImpl();
            request.setAttribute("cust", customerDao.getAll());
        } catch (SQLException e) {
            e.printStackTrace();
        }
        request.getRequestDispatcher("/WEB-INF/HomeShopCustomer.jsp").forward(request, response);
    }
}