package ro.ase.cts.lab6;

import ro.ase.cts.lab6.api.LoginInterface;
import ro.ase.cts.lab6.impl.LoginModule;
import ro.ase.cts.lab6.impl.LoginProxy;

/**
 * LoginModule -> input your password
 *      -> LoginInterface; defines the contract
 *
 * Limit login to 3 attempts
 */

public class Application {

    public static void main(String[] args) {
        LoginInterface loginModule = new LoginModule();

        var result = loginModule.login("admin", "pass");
        System.out.printf("Result is %d\n", result == true ? 1 : 0);

        LoginInterface proxy = new LoginProxy(loginModule);
        proxy.login("user", "user");
        proxy.login("user", "user");
        proxy.login("user", "user");
        proxy.login("user", "user");
    }

}
