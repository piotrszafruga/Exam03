import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;

@WebServlet("/allquotes")
public class Allquotes extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        List<Quote> sessionTexts = (List) session.getAttribute("texts");
        response.setContentType("text/html");
        response.getWriter().append("<table style=\"width:100%\">");
        response.getWriter().append("<tr><th>Author</th><th>content</th><</tr>");
        for (Quote quote: sessionTexts) {
            response.getWriter()
                    .append("<tr><th>"+quote.getAuthor()+"</th><th>"+quote.getContent()+"</th><</tr>");
        }
        response.getWriter().append("</table>");

    }
}
