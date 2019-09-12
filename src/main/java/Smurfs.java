import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/smurfs")
public class Smurfs extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        SmurfDao smurfDao = new SmurfDao();
        List list = smurfDao.getList();

        request.setAttribute("list", list);
        getServletContext().getRequestDispatcher("/smurfs.jsp")
                .forward(request,response);
    }
}
