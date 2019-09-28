package controller;

import service.UserService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import entily.User;
/**
 * @param
 * @return Author
 * Description 拦截/login请求，处理用户登录请求
 * @Date
 **/
@WebServlet(urlPatterns ="/login")
public class UserController extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String account = req.getParameter("account");
        String password  =req.getParameter("passwprd");

        UserService us = new UserService();

        us.init();

        User user = us.userLogin(account, password);

    }
}
