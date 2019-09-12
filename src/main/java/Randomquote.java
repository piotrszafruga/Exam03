import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.List;
import java.util.Random;

@WebServlet("/randomquote")
public class Randomquote extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        response.setCharacterEncoding("UTF-8");
        HttpSession session = request.getSession();

        List<Quote> sessionTexts = (List) session.getAttribute("texts");

        if (sessionTexts == null) {
            response.getWriter().append("Pusta jest lista. <a href=\"/jee_exam_3_war_exploded/addquote\">Formularz</a>");
        } else {
            Random rand = new Random(sessionTexts.size());
            Quote quote = sessionTexts.get(rand.nextInt());
            response.getWriter().append("<table style=\"width:100%\">");
            response.getWriter().append("<tr><th>Author</th><th>content</th><</tr>");
            response.getWriter().append("<tr><th>"+quote.getAuthor()+"</th><th>"+quote.getContent()+"</th><</tr>");
        }

    }
}
