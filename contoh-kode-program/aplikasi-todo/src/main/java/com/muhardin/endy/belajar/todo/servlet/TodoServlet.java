package com.muhardin.endy.belajar.todo.servlet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import java.util.Date;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

@WebServlet("/todo")
public class TodoServlet extends HttpServlet {
    public void doGet(HttpServletRequest req, HttpServletResponse res)
        throws ServletException, IOException {
    
        // isi variabel untuk dipakai di JSP
        Date sekarang = new Date();
        req.setAttribute("waktu", sekarang);    
        
        // tampilkan HTML dengan JSP
        String lokasiJsp = "/WEB-INF/jsp/todo.jsp";
        RequestDispatcher rd = req.getRequestDispatcher(lokasiJsp);
        rd.forward(req, res);
    }
}
