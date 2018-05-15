package jums;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * insertconfirm.jspと対応するサーブレット
 * フォーム入力された情報はここでセッションに格納し、以降持ちまわることになる
 * 直接アクセスした場合はerror.jspに振り分け
 * @author hayashi-s
 */
public class InsertConfirm extends HttpServlet {

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
        
        try{
            HttpSession hs = request.getSession();
            HttpSession session = request.getSession();
            request.setCharacterEncoding("UTF-8");//セッションに格納する文字コードをUTF-8に変更
            String accesschk = request.getParameter("ac");
            
            if(hs.getAttribute("ac") == null || accesschk ==null){
                throw new Exception("直リンクでアクセスした可能性があります。");
            }
            
            //フォームからの入力を取得
            String uID = request.getParameter("uID");
            if(uID.equals("")){
                throw new Exception("IDがありません。");
            }
            
            String name = request.getParameter("name");
            if(name.equals("")){
                throw new Exception("名前がありません。");
            }
            String year = request.getParameter("year");
            if(year.equals("")){
                throw new Exception("生年月日の年がありません。");
            }
            String month = request.getParameter("month");
            if(month.equals("")){
                throw new Exception("生年月日の月がありません。");
            }
            String day = request.getParameter("day");
            if(day.equals("")){
                throw new Exception("生年月日の日がありません。。");
            }
            String type = request.getParameter("type");
            if(type.equals("")){
                throw new Exception("職業が選択されていませ。");
            }
            String tell = request.getParameter("tell");
            if(tell.equals("")){
                throw new Exception("自己紹介がありません。");
            }
            String comment = request.getParameter("comment");
            if(comment.equals("")){
                throw new Exception("コメントが空白です。");
            }
            
            ArrayList <Integer> list = (ArrayList)session.getAttribute("idlist");
            int n = Integer.parseInt(uID);
            if(list.contains(n)){
                
                String a = "ID "+n+" は既に使われています。";
                
                request.setAttribute("error", a);
                request.getRequestDispatcher("/error.jsp").forward(request,response);
            }

            //セッションに格納
            session.setAttribute("uID", uID);
            session.setAttribute("name", name);
            session.setAttribute("year", year);
            session.setAttribute("month",month);
            session.setAttribute("day", day);
            session.setAttribute("type", type);
            session.setAttribute("tell", tell);
            session.setAttribute("comment", comment);
            System.out.println("Session updated!!");
            
            request.getRequestDispatcher("/insertconfirm.jsp").forward(request, response);
            
            
        }catch(Exception e){
            request.setAttribute("error", e.getMessage());
            request.getRequestDispatcher("/error.jsp").forward(request, response);
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
