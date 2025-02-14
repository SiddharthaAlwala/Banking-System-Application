package com.bank.tests;

import com.bank.service.BankService;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankServiceTest {

    @Test
    public void testDeposit(){
        BankService bankService = new BankService("12334", 10000);
        bankService.addTransaction(true, 5000);
        bankService.processTransactions();

        assertEquals(15000.0, bankService.getAccountBalance(), "Withdraw test failed");

    }

    @Test
    public void testInsufficientBalance() {
        BankService bankService = new BankService("123456", 500.0);
        bankService.addTransaction(false, 1000); // Withdraw $1000 (not enough funds)
        bankService.processTransactions();

        assertEquals(500.0, bankService.getAccountBalance(), "Insufficient balance test failed!");
    }
}
