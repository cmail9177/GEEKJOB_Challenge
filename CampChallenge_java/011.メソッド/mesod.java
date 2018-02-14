/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "mesod", urlPatterns = {"/mesod"})
public class mesod extends HttpServlet {

     void myprofile(PrintWriter pw) {
            pw.print("私の名前は林です<br>");
            pw.print("好きな物は<br>");
            pw.print("趣味は<br>");
        }
       protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");//①
        try (PrintWriter out = response.getWriter()) {

            for (int i = 1; i < 10; i++) {
            
                myprofile(out);
            }
 
     
     
     
     
     out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet FortuneTelling</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet FortuneTelling at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");        
            
     
 }
            
}
   
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public String getServletInfo() {
        return "Short description";
    }
}