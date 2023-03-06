package ro.ase.cts.lab1.model;

import ro.ase.cts.lab1.exception.NegativeAmountException;

public interface Banker {

    Account openAccount(AccountType accountType, String holder, int initialAmount) throws NegativeAmountException;

}
