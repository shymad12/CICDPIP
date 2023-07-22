import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Hello extends HttpServlet {

   private String message;

   public void init() throws ServletException {
      // Do required initialization
      message = "Hello from Shyam ";
   }

   public void doGet(HttpServletRequest request, HttpServletResponse response)
      throws ServletException, IOException {

      // Set response content type
      response.setContentType("text/html");

      try {
         // Actual logic goes here.
         PrintWriter out = response.getWriter();
         out.println("<h1>" + message + "</h1>");
      } catch (IOException e) {
         // Log the error instead of printing the stack trace
         e.printStackTrace(); // Replace this with a logger statement (e.g., LOGGER.error("An IOException occurred", e);)
      }
   }
}
