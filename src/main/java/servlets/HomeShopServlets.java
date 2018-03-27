package servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

<<<<<<< Updated upstream
@WebServlet("/homeShop")
=======
@WebServlet("/HomeShop")
>>>>>>> Stashed changes
public class HomeShopServlets extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        super.doPost(request, response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
<<<<<<< Updated upstream

        request.setAttribute("name","HomeShop");

        request.getRequestDispatcher("/HomeShopCustomer.jsp").forward(request, response);
=======
        request.getRequestDispatcher("/WEB-INF/HomeShopCustomer.jsp").forward(request, response);
>>>>>>> Stashed changes

    }
}