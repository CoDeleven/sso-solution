package cn.codeleven.controller;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "loginServlet", urlPatterns = "/login")
public class LoginController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // 用户名
        String username = req.getParameter("username");
        // 密码
        String password = req.getParameter("password");

        req.getSession().setAttribute("username", username);
        req.getSession().setAttribute("password", password);

        req.setAttribute("username", username);
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if(req.getSession().getAttribute("username") != null){
            req.setAttribute("username", req.getSession().getAttribute("username"));
            req.getRequestDispatcher("index.jsp").forward(req, resp);
        }else{
            req.getRequestDispatcher("login.jsp").forward(req, resp);
        }
    }
}
