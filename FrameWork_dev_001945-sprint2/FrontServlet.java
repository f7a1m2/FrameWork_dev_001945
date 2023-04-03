package etu1945.framework.servlet;

import java.io.*;
import java.text.* ;
import java.util.* ;
import jakarta.servlet.* ;
import jakarta.servlet.http.* ;

import etu1945.framework.Mapping;

public class FrontServlet extends HttpServlet {

    HashMap<String,Mapping> MappingUrls;

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
            out.println("<h1>Hello word</h1>");
            out.println("<p>Vous êtes sur la page d'accueil.</p>");
            out.println("</body>");
            out.println("</html>");
    }
}