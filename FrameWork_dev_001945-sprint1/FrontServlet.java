package etu1945.framework.servlet;

import java.io.*;
import java.text.* ;
import java.util.* ;
import javax.servlet.* ;
import javax.servlet.http.* ;

public class FrontServlet extends HttpServlet {

    public  void doGet(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException  {

    }

    public  void doPost(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException  {

	}

    public  void processRequest(HttpServletRequest request, HttpServletResponse response) 
        throws ServletException, IOException  {
        
            response.setContentType("text/html");
            PrintWriter out = response.getWriter(); 
            
            out.println("<html>");
            out.println("<head><title>Ma page</title></head>");
            out.println("<body>");
            out.println("<h1>"+ this.getServletPath() +"</h1>");
            out.println("<p>Vous êtes sur la page d'accueil.</p>");
            out.println("</body>");
            out.println("</html>");
    }
}