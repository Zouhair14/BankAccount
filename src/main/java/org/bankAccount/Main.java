package org.bankAccount;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        Account account = new Account("zouhair",4000);
        List<Operation> operations = new ArrayList<>();
        account.setOperations(operations);

        account.deposit(3500);
        account.withdrawal(2900);
        account.deposit(2000);
        account.withdrawal(5000);
        account.withdrawalAll();
        account.getOperations().forEach(c -> System.out.println("Operation = "+ c.getOperation()+" Date = " + c.getDate()+" balance =" + c.getBalance()));
    }
}
