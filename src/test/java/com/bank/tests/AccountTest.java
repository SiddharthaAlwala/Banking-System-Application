package com.bank.tests;

import com.bank.model.Account;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AccountTest {
    @Test
    public void testDeposit(){
        Account account = new Account("123", 1000);
        account.deposit(600);
        assertEquals(1600, account.getBalance());
    }
}
