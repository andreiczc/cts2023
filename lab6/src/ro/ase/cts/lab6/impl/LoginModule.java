package ro.ase.cts.lab6.impl;

import ro.ase.cts.lab6.api.LoginInterface;

public class LoginModule implements LoginInterface {

    private static final String USERNAME = "admin";
    private static final String PASSWORD = "pass";

    @Override
    public boolean login(String username, String password) {
        if(username == null || password == null) {
            return false;
        }

        return username.equals(USERNAME)
                    && password.equals(PASSWORD);
    }
}
