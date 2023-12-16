package passenger;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/take-call4")
public class PassengerServlet extends HttpServlet {
    PassengerService passengerService = new PassengerService();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Passenger passenger = new Passenger(req.getParameter("gender"),
                req.getParameter("name"),
                req.getParameter("surname"),
                req.getParameter("age"),
                req.getParameter("country"),
                req.getParameter("email"));
        passengerService.create(passenger);
        req.setAttribute("passenger", passenger.toString());
        req.getRequestDispatcher("page5_Victory.jsp").forward(req, resp);
    }
}
