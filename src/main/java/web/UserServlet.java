package web;

import user.User;
import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/aboutUser")
public class UserServlet extends HttpServlet {
    UserService userService = new UserService();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        User user = new User(req.getParameter("gender"),
                req.getParameter("name"),
                req.getParameter("surname"),
                req.getParameter("age"),
                req.getParameter("country"),
                req.getParameter("email"));
        userService.create(user);
        req.setAttribute("user", user.toString());
        req.getRequestDispatcher("page5_Victory.jsp").forward(req, resp);
    }
}
