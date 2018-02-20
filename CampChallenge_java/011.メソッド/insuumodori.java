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


@WebServlet(name = "insuumodori", urlPatterns = {"/insuumodori"})
public class insuumodori extends HttpServlet {
 
    ArrayList<String> NAMA(String Id){
        
    ArrayList <String> num= new ArrayList<String>();
    
    String List[] = new String[9];
    
    List[0] = "1";
    List[1] = "生年月日";
    List[2] = null;
        
    String A2[] = new String[9];
    A2[0] = "2";
    A2[1] = "生年月日";
    A2[2] = "住所 東京";
    
    String A3[] = new String[9];
    A3[0] = "3";
    A3[1] = "生年月日";
    A3[2] = "住所";
       
        if(Id=="1"){              //代入
            num.add(List[0]);
            num.add(List[1]);
            num.add(List[2]);
        }
        
        if(Id=="2"){
            num.add(A2[0]);
            num.add(A2[1]);
            num.add(A2[2]);
        }
        
        if(Id=="3"){
            num.add(A3[0]);
            num.add(A3[1]);
            num.add(A3[2]);
        }
        return num;

}
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

          ArrayList<String>T=new ArrayList<String>();
                  
                 T= NAMA("1");
                 
                 out.print(T.get(0));
                 out.print(T.get(1));
                 out.print(T.get(2)+"<br>");
                 
                 T= NAMA("2");
                 
                 out.print(T.get(0));
                 out.print(T.get(1));
                 out.print(T.get(2)+"<br>");
                 
                 T= NAMA("3");
  
                 out.print(T.get(0));
                 out.print(T.get(1));
                 out.print(T.get(2)+"<br>");
           





            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NewServlet at " + request.getContextPath() + "</h1>");
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
