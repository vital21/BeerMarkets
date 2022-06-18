package org.example.controller.trash;


import org.example.input.RegistrationUsers;

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

    public void process() throws ServletException, IOException, ClassNotFoundException {
        String name = request.getParameter("login");
        PrintWriter pw = response.getWriter();
        String nameAdmin="vitaliy";
        String inputDispatcher=request.getParameter("input");
        if(inputDispatcher.equals("input")){
            if(name.equals(nameAdmin)){
                RequestDispatcher requestDispatcher=request.getRequestDispatcher("WEB-INF/view/adminMenu.jsp");
                requestDispatcher.forward(request,response);

            }
            if(!name.equals(nameAdmin) && name!=null){
                RequestDispatcher requestDispatcher=request.getRequestDispatcher("WEB-INF/view/userMenu.jsp");
                requestDispatcher.forward(request,response);

            }
        }
        if(inputDispatcher.equals("registration")){
            RequestDispatcher requestDispatcher=request.getRequestDispatcher("WEB-INF/view/registration.jsp");
            requestDispatcher.forward(request,response);
           // String inputRegistration=request.getParameter("inputUser");
            //if(inputRegistration.equals("registrationUser")){
                RegistrationUsers registrationUsers=new RegistrationUsers(response,request);
                registrationUsers.registrationUser();
                registrationUsers.dataBaseRegistrationUser();
           // }
        }



    }
}
