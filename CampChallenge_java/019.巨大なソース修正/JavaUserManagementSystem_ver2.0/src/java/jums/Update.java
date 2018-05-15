package jums;

import base.DBManager;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author hayashi-s
 */
public class Update extends HttpServlet {

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
            String t = request.getParameter("id");
            int n = Integer.parseInt(t);
            
            String sql = "select * from user_t where userID="+n+"";
            
            con = DBManager.getConnection();
            
            st = con.prepareStatement(sql);
            
            ResultSet rs = st.executeQuery();
            
            rs.next();
            UserDataDTO Tdata = new UserDataDTO();
            
            Tdata.setUserID(rs.getInt(1));
            Tdata.setName(rs.getString(2));
            Tdata.setBirthday(rs.getDate(3));
            Tdata.setTell(rs.getString(4));
            Tdata.setType(rs.getInt(5));
            Tdata.setComment(rs.getString(6));
            Tdata.setNewDate(rs.getTimestamp(7));
            
            
            
            
            
//            UserDataBeans udb = new UserDataBeans();
//            udb.UD2DTOMapping(Tdata);
            
//            request.setAttribute("Beansのデータ",udb);
            request.setAttribute("DTOデータ",Tdata);
            
            
          
            
            request.getRequestDispatcher("/update.jsp").forward(request, response);
        }catch(Exception e){
            request.setAttribute("error", e);
            request.getRequestDispatcher("/error.jsp").forward(request,response);
        }
        
        finally {
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
