package jums;

import base.DBManager;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.sql.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hayashi-s
 */
public class UpdateResult extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        
        Connection con = null;
        PreparedStatement st = null;
        
        try {
            request.setCharacterEncoding("UTF-8");
            
            String ID = request.getParameter("更新");
            int id = Integer.parseInt(ID);
            
            
            String name =request.getParameter("name");
            String year = request.getParameter("year");
            String month = request.getParameter("month");
            String day = request.getParameter("day");
            String tell= request.getParameter("tell");
            String type = request.getParameter("type");
            String comment = request.getParameter("comment");
      
            UserDataBeans udb = new UserDataBeans();
            
            udb.setName(name);
            udb.setYear(year);
            udb.setMonth(month);
            udb.setDay(day);
            udb.setTell(tell);
            udb.setType(type);
            udb.setComment(comment);
            
            UserDataDTO DTO =  new UserDataDTO();
            udb.UD2DTOMapping(DTO);
            
            String Dname = DTO.getName();
            
            SimpleDateFormat S = new SimpleDateFormat("yyyy-MM-dd");
            String t = S.format(DTO.getBirthday());
            Date d = Date.valueOf(t);
            
            
            int Dtype = DTO.getType();
            String Dtell = DTO.getTell();
            String Dcomment = DTO.getComment();
            
            con = DBManager.getConnection();
           
            st = con.prepareStatement("update user_t set name =? ,birthday=?,type=?,tell=?,comment=? where userID="+id+"");
            st.setString(1, Dname);
            st.setDate(2, d);
            st.setInt(3,Dtype);
            st.setString(4, Dtell);
            st.setString(5, Dcomment);
           
            st.executeUpdate();
            
            request.setAttribute("DTOdate", DTO);
            request.getRequestDispatcher("/updateresult.jsp").forward(request,response);
            
        }catch(Exception e){
        
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request,response);
            
            
        }finally {
            out.close();
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
