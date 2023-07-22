// Import required java libraries
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

// Extend HttpServlet class
public class Hello extends HttpServlet {

   private String message;

   public void init() throws ServletException {
      // Do required initialization
      message = "Hello from Shyam";
   }

   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

      // Set response content type
      response.setContentType("text/html");

      // Actual logic goes here.
      try {
         PrintWriter out = response.getWriter();
         out.println("<h1>" + message + "</h1>");
      } catch (IOException e) {
         // Handle the IOException here (e.g., logging the error or sending an error response)
         e.printStackTrace();
      }
   }
}
