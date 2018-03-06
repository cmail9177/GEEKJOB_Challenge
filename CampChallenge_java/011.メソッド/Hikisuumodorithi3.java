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

/**
 *
 * @author guest1Day
 */
@WebServlet(name = "Hikisuumodorithi2", urlPatterns = {"/Hikisuumodorithi2"})
public class Hikisuumodorithi3 extends HttpServlet {
    
    public ArrayList<String> main(String n){
        
        if(n.equals("0")){
        ArrayList <String> satoshi =new ArrayList<String>();
        satoshi.add(n);
        satoshi.add("生年月日");
        satoshi.add(null);
        return satoshi; 
        }
        else if(n.equals("1")){
        ArrayList <String> hiromi = new ArrayList <String>();
        hiromi.add(n);
        hiromi.add("生年月日");
        hiromi.add("鹿児島県");
        return hiromi;
        }
        else if(n.equals("2")){
        ArrayList<String> tomoko=new ArrayList <String>();
        tomoko.add(n);
        tomoko.add("生年月日");
        tomoko.add("広島県");
        return tomoko;
        }
        
        return null;
    }
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            
           
            int limit=2;
            //String a =String.valueOf(limit);
            for(int i=0;i<limit;i++){
              String limitmozi=String.valueOf(i);
                ArrayList<String> SET=main(limitmozi);
              
                for(int p=0 ;  p<SET.size() ; p++){
                    if(SET.get(p)==null){
                    continue;}
                        out.print(SET.get(p));
                
            }
            }
            /*for(int j=0; j<SET.size(); j++){
                if(SET.get(i)==null)  {continue;}
             out.print(SET.get(j)+"<br>");
            }
            
             ArrayList SET2=main("456");
            for(int i=0; i<SET2.size(); i++){
                if(SET2.get(i)==null)  {continue;}
             out.print(SET2.get(i)+"<br>");
            }
            
             ArrayList SET3=main("789");
            for(int i=0; i<SET3.size(); i++){
                 if(SET3.get(i)==null){continue;}
                 else if(limit==2){
             out.print(SET3.get(i)+"<br>");
            }
            }
                }*/
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet hikisuumodorithi2</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet hikisuumodorithi2 at " + request.getContextPath() + "</h1>");
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
