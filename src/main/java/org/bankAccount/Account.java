package org.bankAccount;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Account {
    private String name;
    private double balance;
    private static List<Operation> operations;

    public Account() {
    }

    public Account(String name, double balance) {
        this.name = name;
        this.balance = balance;
    }

    public void deposit(double money){
        this.balance+=money;
        Operation deposit = new Operation("deposit", LocalDate.now(),money);
        operations.add(deposit);
        System.out.println("new balance = "+this.balance);
    }

    public void withdrawal(double money){
        if (this.balance-money>0){
            this.balance-=money;
            Operation withdrawal = new Operation("withdrawal", LocalDate.now(),money);
            operations.add(withdrawal);
            System.out.println("new balance = "+this.balance);
        }else {
            System.out.println("faild withdrawal ");
        }
    }
    public void withdrawalAll(){
        Operation withdrawalall = new Operation("withdrawalall", LocalDate.now(),this.balance);
        this.balance = 0;
        operations.add(withdrawalall);
        System.out.println("new balance = "+ 0);
    }

    public List<Operation> getOperations() {
        return operations;
    }

    public static void setOperations(List<Operation> operations) {
        Account.operations = operations;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
