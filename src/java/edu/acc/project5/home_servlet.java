package edu.acc.project5;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Ryan Sprague
 */
@WebServlet(name = "home_servlet", urlPatterns = {"/home"})
public class home_servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        CommentManager manager = (CommentManager) getServletContext().getAttribute("manager");
        
        request.setAttribute("userComments", manager.getAllComments());
        System.out.println(manager.getAllComments().length);
        request.getRequestDispatcher("/WEB-INF/home.jsp").forward(request, response);
    }
}
