package whoIsYou;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/take-call3")
public class WhoIsYou extends HttpServlet {
    WhoIsYouMain whoIsYouMain = new WhoIsYouMain();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String option = req.getParameter("option");
        String bridge = whoIsYouMain.trueYourself(option);
        req.getRequestDispatcher(bridge).forward(req, resp);
    }
}




