package servlets;

import com.homeShop.dao.CustomerDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

/**
 * Created by Gleb on 04.04.18.
 */
@WebServlet("/RemoveCustomer")
public class RemoveCustomer extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       /*Integer id = Integer.parseInt(req.getParameter("id"));*/

        try {
            CustomerDaoImpl customerDao = new CustomerDaoImpl();
            customerDao.remove(Integer.parseInt(req.getParameter("id")));
        } catch (SQLException e) {
            e.printStackTrace();
        }
        resp.sendRedirect("HomeShop");
    }
}
