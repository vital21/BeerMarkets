package org.example.controller;

import org.example.controller.command.*;

public enum CommandType {
    LOGIN_COMMAND(new LoginCommand()),
    REGISTRATION_COMMAND(new RegistrationCommand()),
    REGISTRATION_USER_COMMAND(new RegistrationUserCommand()),
    VIEW_PRODUCTS_COMMAND(new ViewProductsCommand()),
    INSERT_BEER_IN_DB(new InsertBeerInDB()),
    INSERT_PAGE(new InsertPage());
    private final CustomCommand command;
    CommandType(CustomCommand command) {
        this.command=command;
    }
    public CustomCommand getCommand(){
        return command;
    }
}
