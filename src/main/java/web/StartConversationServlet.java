package web;

import service.StartConversationService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/take-call1")
public class StartConversationServlet extends HttpServlet {
    StartConversationService conversationService = new StartConversationService();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String option = req.getParameter("option");
        req.setAttribute("reply", conversationService.answer(option));
        String bridge = conversationService.toBridge(option);
        req.getRequestDispatcher(bridge).forward(req, resp);
    }
}
