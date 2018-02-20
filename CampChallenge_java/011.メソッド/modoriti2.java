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
import java.util.ArrayList;


@WebServlet(name = "modoriti2", urlPatterns = {"/modoriti2"})
public class modoriti2 extends HttpServlet {
    
 
  String[] test(){
    String data[] = new String[3];
    data[0] = "9999";
    data[1] = "2000";
    data[2] = "東京";
    
    return data;
    
}
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
          
//            String name[];
          String data[];
                  data = test();
           out.print(data[1]+"<br>");
           out.print(data[2]);
            
           
           
           //     ArrayList<String> yasuda = new ArrayList<String>();{
//            yasuda.add("ABC");
//            yasuda.add("1991年３月３日");
//            yasuda.add("東京都");
//           
//}
//      String AAA(String yasuda) {
//           
//            return AA;
//             na.get(1) +"(生年月日)";
//     return na.get(2) +"(住所)";
           
           
            
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet modoriti2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet modoriti2 at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
