package org.example.controller.command;

import org.example.controller.CustomCommand;
import org.example.controller.PagePath;
import org.example.controller.RequestParameter;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;

public class LoginCommand implements CustomCommand {
    @Override
    public String executeCommand(HttpServletRequest request) {
        String page=null;

        String login=request.getParameter(RequestParameter.LOGIN);
        request.setAttribute("userName",login);
        String password=request.getParameter(RequestParameter.PASSWORD);
        if (login.equals("vitaliy")){

            page= PagePath.ADMIN_MENU;
        }
        if(!login.equals("vitaliy")&&login!=null ){
            page=PagePath.USER_MENU;
            ServletContext servletContext= request.getServletContext();
            servletContext.setAttribute("buyProduct",null);
        }
        return page;
    }
}
