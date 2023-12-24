package bridge;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/take-call2")
public class CapitanBridgeServlet extends HttpServlet {
    CapitanBridgeService capitanBridgeService = new CapitanBridgeService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String option = req.getParameter("option");
        req.setAttribute("reply", capitanBridgeService.answer(option));
        String whoAreYou = capitanBridgeService.whoAreYou(option);
        req.getRequestDispatcher(whoAreYou).forward(req, resp);
    }
}
