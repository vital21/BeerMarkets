package org.example.controller.command;

import org.example.controller.CustomCommand;
import org.example.controller.PagePath;

import javax.servlet.http.HttpServletRequest;

public class RegistrationUserCommand implements CustomCommand {
    @Override
    public String executeCommand(HttpServletRequest request) {
        String page;
        page= PagePath.LOGIN;
        return page;
    }
}
