package startConversation;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/take-call1")
public class StartConversation extends HttpServlet {
    StartConversationMain conversationMain = new StartConversationMain();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String option = req.getParameter("option");
        String bridge = conversationMain.toBridge(option);
        req.getRequestDispatcher(bridge).forward(req, resp);
    }
}
