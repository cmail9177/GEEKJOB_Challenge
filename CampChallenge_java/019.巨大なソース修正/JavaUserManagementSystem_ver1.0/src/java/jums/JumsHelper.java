package jums;

/**
 * 画面系の処理や表示を簡略化するためのヘルパークラスです。定数なども保存されます
 * @author hayashi-s
 */

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpServletRequest;
public class JumsHelper {
    
    
    
    //トップへのリンクを定数として設定
    private final String homeURL = "index.jsp";
    private final String modoru = "javascript:history.go(-1)";
    
                                    
    
    public static JumsHelper getInstance(){
        return new JumsHelper();
    }
    
    //トップへのリンクを返却
    public String home(){
        return "<a href=\""+homeURL+"\">トップへ戻る</a>";
    }

    public String modoru(){

    return "<a href=\""+modoru+"\">戻る</a>";
}
 
}