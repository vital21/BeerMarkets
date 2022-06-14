package org.example.controller;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class DispatcherServlet  {
    private HttpServletResponse response;
    private HttpServletRequest request;

    public DispatcherServlet(HttpServletResponse response, HttpServletRequest request) {
        this.response = response;
        this.request = request;
    }

    public HttpServletResponse getResponse() {
        return response;
    }

    public void setResponse(HttpServletResponse response) {
        this.response = response;
    }

    public HttpServletRequest getRequest() {
        return request;
    }

    public void setRequest(HttpServletRequest request) {
        this.request = request;
    }

    public void process() throws ServletException, IOException {
        String name = request.getParameter("login");
        PrintWriter pw = response.getWriter();
        String nameAdmin="vitaliy";

        if(name.equals(nameAdmin)){
            RequestDispatcher requestDispatcher=request.getRequestDispatcher("WEB-INF/view/adminMenu.jsp");
            requestDispatcher.forward(request,response);
            pw.println(name);
        }
        if(!name.equals(nameAdmin)){
            RequestDispatcher requestDispatcher=request.getRequestDispatcher("WEB-INF/view/userMenu.jsp");
            requestDispatcher.forward(request,response);
            pw.println(name);
        }

    }
}
