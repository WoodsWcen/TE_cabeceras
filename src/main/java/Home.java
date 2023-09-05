
import com.emergentes.RespHTML;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = {"/Home"})
public class Home extends HttpServlet {


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
            try{
                out.println("<!DOCTYPE html>");
                out.println("<html>");
                out.println("<head>");
                out.println("<title>JSP Page</title>");            
                out.println("</head>");
                out.println("<body>");
                out.println("<h1>Respuesta usando cabeceras en servlet</h1>");
                out.println("<ul>");
                out.println("<li><a href=\"RespHTML\">Devolver un HTML</a></li>");
                out.println("<li><a href=\"RespCSV\">Devolver un CSV</a></li>");
                out.println("<li><a href=\"RespJSON\">Devolver un JSON</a></li>");
                out.println("<li><a href=\"RespXLS\">Devolver un XLS</a></li>");
                out.println("<li><a href=\"RespXML\">Devolver un XML</a></li>");
                out.println("<li><a href=\"RespPDF\">Devolver un PDF</a></li>");
                out.println("</ul>");
                out.println("</body>");
                out.println("</html>");
            }finally{
                out.close();
            }
    }
}
