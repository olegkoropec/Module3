package whoIsYou;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/take-call3")
public class WhoIsYouServlet extends HttpServlet {
    WhoIsYouService whoIsYouService = new WhoIsYouService();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String option = req.getParameter("option");
        req.setAttribute("reply", whoIsYouService.answer(option));
        String bridge = whoIsYouService.trueYourself(option);
        req.getRequestDispatcher(bridge).forward(req, resp);
    }
}




