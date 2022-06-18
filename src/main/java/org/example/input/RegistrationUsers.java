package org.example.input;

import org.example.repository.User;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class RegistrationUsers {
    private HttpServletResponse response;
    private HttpServletRequest request;
    private User user;

    public RegistrationUsers(HttpServletResponse response, HttpServletRequest request) {
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
    public void registrationUser(){
        user=new User();
        user.setLogin(request.getParameter("login"));
        user.setEmail(request.getParameter("email"));
        user.setPassword(request.getParameter("password"));
    }
    public void dataBaseRegistrationUser() throws ClassNotFoundException {

        DataBaseConnect dataBaseConnect=new DataBaseConnect();
        dataBaseConnect.registrationUserDataBase(user.getLogin(),user.getPassword(),user.getEmail());
    }
}
