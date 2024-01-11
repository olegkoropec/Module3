package web;

import service.WhoAreYouService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/whoAreYou")
public class WhoAreYouServlet extends HttpServlet {
    WhoAreYouService whoAreYouService = new WhoAreYouService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String option = req.getParameter("option");
        req.setAttribute("reply", whoAreYouService.answer(option));
        String bridge = whoAreYouService.isTrueAboutYourself(option);
        req.getRequestDispatcher(bridge).forward(req, resp);
    }
}




