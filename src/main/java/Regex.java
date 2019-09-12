import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/regex")
public class Regex extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String str = request.getParameter("param1");
        System.out.println(str);
        Boolean match = str.matches("^[a-z]+\\.(jpg|git|png)$");
        if (match) {
            String link = "<meta http-equiv='refresh' content='5; url=https://www.google.pl/#q=" + str + "'/>";
            request.setAttribute("link", link);
        }
        getServletContext().getRequestDispatcher("/regex.jsp")
                .forward(request, response);
    }
}
