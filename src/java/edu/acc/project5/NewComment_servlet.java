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
@WebServlet(name = "newComment_servlet", urlPatterns = {"/comment"})
public class NewComment_servlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        request.getRequestDispatcher("/WEB-INF/newComment.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String name = request.getParameter("username");
        String comment = request.getParameter("comment");
        
        if (name == null || name.length() == 0 ||
                comment == null || comment.length() == 0) {
            request.setAttribute("error", "You didn't type anything.");
            request.getRequestDispatcher("/WEB-INF/newComment.jsp").forward(request, response);
        } else {
            CommentManager manager = (CommentManager) getServletContext().getAttribute("manager");
            manager.addComment(new Comment(name, comment));
        }
        
        response.sendRedirect("/project5/home");
    }

}
