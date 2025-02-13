package com.bank.thread;

import com.bank.model.Account;

public class TransactionThread extends Thread{
    private Account account;
    private boolean isDeposit;
    private double amount;

    public TransactionThread(Account account, boolean isDeposit, double amount) {
        this.account = account;
        this.isDeposit = isDeposit;
        this.amount = amount;
    }

    @Override
    public void run(){
        if(isDeposit){
            account.deposit(amount);
        }
        else{
            account.withdraw(amount);
        }
    }
}
