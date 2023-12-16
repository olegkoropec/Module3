package bridge;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/take-call2")
public class CapitanBridge extends HttpServlet {
    CapitanBridgeMain capitanBridgeMain = new CapitanBridgeMain();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String option = req.getParameter("option");
        String whoAreYou = capitanBridgeMain.whoAreYou(option);
        req.getRequestDispatcher(whoAreYou).forward(req, resp);
    }
}
