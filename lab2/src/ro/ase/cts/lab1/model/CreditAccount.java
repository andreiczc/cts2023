package ro.ase.cts.lab1.model;

import ro.ase.cts.lab1.exception.InsufficientBalanceException;
import ro.ase.cts.lab1.exception.NegativeAmountException;

public class CreditAccount extends Account{

    private static final int MAX_CREDIT_AMOUNT = -10000;

    private String holder;

    public CreditAccount(String holder) {
        this.holder = holder;
    }

    /*
    deposit -> as in base class*
    withdraw -> up to 10.000 money units more than your balance
     */

    @Override
    public void withdraw(int amount) throws NegativeAmountException, InsufficientBalanceException {
        if(this.getBalance() - amount < MAX_CREDIT_AMOUNT) {
            throw new InsufficientBalanceException();
        }

        super.setBalance(getBalance() - amount);
    }
}
