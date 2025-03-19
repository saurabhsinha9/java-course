import java.io.*;

import javax.servlet.ServletException;
import javax.servlet.http.*;

public class HelloWorld extends HttpServlet {

public void service(HttpServletRequest request, HttpServletResponse response) throws  IOException, ServletException{
  response.setContentType("text/html");
  PrintWriter out = response.getWriter();
  out.println("<html>");
  out.println("<head>");
  out.println("<title>Hello World Servlet!</title>");
  out.println("</head>");
  out.println("<body>");
  out.println("<p align=\"center\"><font size=\"5\" color=\"#000080\">Hello World!</font></p>");
  out.println("<p align=\"center\"><a href=\"javascript:history.back()\">Go to Home</a></p>");
  out.println("</body>");
  out.println("</html>");
   }
}