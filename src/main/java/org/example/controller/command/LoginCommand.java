package org.example.controller.command;

import org.example.controller.CustomCommand;
import org.example.controller.PagePath;
import org.example.controller.RequestParameter;

import javax.servlet.http.HttpServletRequest;

public class LoginCommand implements CustomCommand {
    @Override
    public String executeCommand(HttpServletRequest request) {
        String page=null;
        String login=request.getParameter(RequestParameter.LOGIN);
        String password=request.getParameter(RequestParameter.PASSWORD);
        if (login.equals("vitaliy")&& login!=null){
            page= PagePath.ADMIN_MENU;
        }
        else {
            page = PagePath.REGISTRATION;
        }
        return page;
    }
}
