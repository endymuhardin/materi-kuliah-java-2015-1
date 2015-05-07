package com.muhardin.endy.belajar.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;

@WebServlet("/halo.php")
public class HaloServlet extends HttpServlet {
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
                                       throws ServletException, IOException {
                                       
        System.out.println("Menjalankan HaloServlet");                               
        PrintWriter output = resp.getWriter();
        
        resp.setContentType("text/html");
        
        String nama = req.getParameter("nama");
        
        output.println("<html>");
        output.println("<head>");
        output.println("<title>HaloServlet</title>");
        output.println("</head>");
        output.println("<body>");
        output.println("<h1>Halo "+nama+"</h1>");
        output.println("</body>");
        output.println("</html>");
        output.flush();
    }
}
