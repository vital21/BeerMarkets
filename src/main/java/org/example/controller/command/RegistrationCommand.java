package org.example.controller.command;

import org.example.controller.CustomCommand;
import org.example.controller.PagePath;
import org.example.controller.RequestParameter;

import javax.servlet.http.HttpServletRequest;

public class RegistrationCommand implements CustomCommand {
    @Override
    public String executeCommand(HttpServletRequest request) {
        String page;
        String email=request.getParameter(RequestParameter.EMAIL);
        String password=request.getParameter(RequestParameter.PASSWORD);
        page= PagePath.REGISTRATION;
        return page;
    }
}
