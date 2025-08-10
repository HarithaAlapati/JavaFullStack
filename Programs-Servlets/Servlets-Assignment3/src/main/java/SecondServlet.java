import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/SecondServlet")
public class SecondServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        HttpSession session = request.getSession(false); // Don't create new session

        if (session != null) {
            String name = (String) session.getAttribute("username");
            String password = (String) session.getAttribute("password");

            out.println("<h2>Session Data</h2>");
            out.println("Name: " + name + "<br>");
            out.println("Password: " + password + "<br>");
        } else {
            out.println("No session found. Please login first.");
        }
    }
}
