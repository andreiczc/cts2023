package ro.ase.cts.lab6.impl;

import ro.ase.cts.lab6.api.LoginInterface;

import java.util.HashMap;
import java.util.Map;

/**
 * limit login based on username;
 * max 3 attempts per username
 */

public class LoginProxy implements LoginInterface {

    private final static int MAX_LOGIN_ATTEMPTS = 3;
    private final LoginInterface loginModule;
    private final Map<String, Integer> loginCount;

    public LoginProxy(LoginInterface loginModule) {
        this.loginModule = loginModule;
        this.loginCount = new HashMap<>();
    }

    @Override
    public boolean login(String username, String password) {
        var count = loginCount.getOrDefault(username, 0);
        if(count >= MAX_LOGIN_ATTEMPTS) {
            System.out.println("Max attempts exceeded");

            return false;
        }

        var result = loginModule.login(username, password);
        if(result) {
            loginCount.put(username, 0);
        } else {
            loginCount.put(username, ++count);
        }

        return result;
    }
}
