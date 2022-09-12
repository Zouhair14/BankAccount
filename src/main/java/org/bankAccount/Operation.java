package org.bankAccount;

import java.time.LocalDate;

public class Operation {
    private String operation;
    private LocalDate date;
    private double balance;

    public Operation(String operation, LocalDate date, double balance) {
        this.operation = operation;
        this.date = date;
        this.balance = balance;
    }

    public String getOperation() {
        return operation;
    }

    public LocalDate getDate() {
        return date;
    }

    public double getBalance() {
        return balance;
    }

}
