package com.bank;

import com.bank.service.BankService;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        BankService bankService = new BankService("123456", 1000.0);
        bankService.addTransaction(true, 200);
        bankService.addTransaction(false, 300);
        bankService.addTransaction(true, 500);
        bankService.addTransaction(false, 700);

        bankService.processTransactions();


    }
}