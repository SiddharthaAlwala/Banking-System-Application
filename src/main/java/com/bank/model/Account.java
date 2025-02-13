package com.bank.model;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Account {
    private String accountNumber;
    private double balance;
    private final Lock lock = new ReentrantLock();

    public Account(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }

    public void deposit(double amount){
        lock.lock();
        try{
            balance += amount;
            System.out.print(" Deposited $ "+ balance);
        }
        finally {
            lock.unlock();
        }

    }

    public void withdraw(double amount){
        lock.lock();
        try {
            if (balance >= amount) {
                balance -= amount;
                System.out.println(" Withdraw $" + amount + ". Remaining Balance: $" + balance);

            } else {
                System.out.println("Insufficient Balance for withdrawal");

            }
        }   finally {
            lock.unlock();
        }
    }

    public double getBalance(){
        return balance;
    }
}
