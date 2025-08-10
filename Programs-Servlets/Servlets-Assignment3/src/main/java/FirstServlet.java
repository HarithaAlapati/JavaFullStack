import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

@WebServlet("/FirstServlet")
public class FirstServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("name");
        String password = request.getParameter("password");

        // Store in session
        HttpSession session = request.getSession();
        session.setAttribute("username", name);
        session.setAttribute("password", password);

        out.println("<h2>Details stored in session.</h2>");
        out.println("<a href='SecondServlet'>Go to Second Servlet</a>");
    }
}
