package ro.ase.cts.lab1;

import ro.ase.cts.lab1.exception.InsufficientBalanceException;
import ro.ase.cts.lab1.exception.InvalidAccountException;
import ro.ase.cts.lab1.exception.NegativeAmountException;
import ro.ase.cts.lab1.model.*;

public class Application {

    public static void main(String[] args) throws NegativeAmountException, InsufficientBalanceException, InvalidAccountException {
        var banker = new RegularBanker("Joe");
        banker.openAccount(AccountType.CURRENT, "Test", 100);

        var banker2 = new AdminBanker("Admin");
        banker2.openAccount(AccountType.SAVINGS, "Test2", 1000);
    }
}
