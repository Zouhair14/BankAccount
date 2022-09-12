package org.bankAccountTest;

import org.bankAccount.Account;
import org.bankAccount.Operation;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class AccountTest {
    private Account account;
    private List<Operation> operation;
    @Before
    public void initialise() {
        account = new Account("zouhair",2000);
        operation = new ArrayList<>();
        account.setOperations(operation);
    }

    @Test
    public void deposit() {
        account.deposit(2000);
        assertEquals(account.getBalance(),4000);
        assertEquals(account.getOperations().get(0).getBalance(), 2000);
        assertEquals(account.getOperations().get(0).getOperation(), "deposit");
    }

    @Test
    public void withdrawal() {
        account.withdrawal(1000);
        assertEquals(account.getBalance(),1000);
        assertEquals(account.getOperations().get(0).getBalance(), 1000);
        assertEquals(account.getOperations().get(0).getOperation(), "withdrawal");
    }

    @Test
    public void withdrawalAll() {
        account.withdrawalAll();
        assertEquals(account.getBalance(),0);
        assertEquals(account.getOperations().get(0).getBalance(), 2000);
        assertEquals(account.getOperations().get(0).getOperation(), "withdrawalall");
    }
}