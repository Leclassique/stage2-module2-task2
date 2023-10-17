package com.example.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
@Override
    protected void doGet(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse) throws ServletException, IOException{
    HttpSession httpSession = httpServletRequest.getSession();
    if (httpSession.getAttribute("user") != null) {
        httpServletResponse.sendRedirect("/user/hello.jsp");
    } else {
        httpServletResponse.sendRedirect("/login.jsp");
    }
}
}

