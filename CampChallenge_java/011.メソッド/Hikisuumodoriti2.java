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

@WebServlet(name = "insuumodoriti2", urlPatterns = {"/insuumodoriti2"})
public class insuumodoriti2 extends HttpServlet {

    public String[] BIGDATA(String ID) {

        if (ID=="0") {
            String[] minideta1 = {ID, "1991", "神奈川"};
            return minideta1;
        }

        if (ID == "1") {
            String[] minideta2 = {ID, "1991", null};
            return minideta2;
        }

        if (ID == "2") {
            String[] minideta3 = {ID, "1989", "沖縄"};
            return minideta3;
        }

        return null;
    }

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            
            

           
            String[] a = BIGDATA("0");
            for (int i = 0; i < 3; i++) {
                out.print(a[i] + "<br>");
            }
                
                 String[] b = BIGDATA("1");
                for (int i = 0; i < 3; i++) {
                    if (b[i] == null) {
                        continue;
                    }
                    out.print(b[i] + "<br>");
                }
    
                
                    String[] c = BIGDATA("2");
                for (int i = 0; i < 3; i++) {
                    out.print(c[i] + "<br>");
                }

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet insuu2</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet insuu2 at " + request.getContextPath() + "</h1>");
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
