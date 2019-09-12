import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@WebServlet("/addquote")
public class Addquote extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        String text = request.getParameter("text");
        String author = request.getParameter("author");
        Quote quote = new Quote(author, text);

        List<Quote> sessionTexts = (List) session.getAttribute("texts");

        if (sessionTexts != null) {
            sessionTexts.add(quote);
        } else {
            List<Quote> list = new ArrayList<>();
            list.add(quote);
            session.setAttribute("texts", list);
        }


    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.getWriter()
                .append("<form action='addquote' method='POST'>")
                .append("<input type='text' name='text'>")
                .append("<input type='submit' value='Dodaj'>")
                .append("</form>");
    }
}
