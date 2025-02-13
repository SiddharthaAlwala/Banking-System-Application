package com.bank.service;

import com.bank.model.Account;
import com.bank.thread.TransactionThread;

import java.util.ArrayList;
import java.util.List;

public class BankService {
    private final Account account;
    private final List<TransactionThread> transactions;

    public BankService(String accountNumber, double initialBalance) {
        this.account = new Account(accountNumber, initialBalance);
        this.transactions = new ArrayList<>();
    }

    public void addTransaction(boolean isDeposit, double amount){
         transactions.add(new TransactionThread(account, isDeposit, amount));
    }

    public void processTransactions(){
        // Start all threads
        for(TransactionThread t: transactions){
            t.start();
        }

        for(TransactionThread t: transactions){
            try {
                t.join();
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }

        System.out.println("Final Balance: $" + account.getBalance());
    }
}
