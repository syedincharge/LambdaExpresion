package com.rizvi.functionalprograming.realexample;

public interface AccountFactory {

    public abstract BankAccount getBankAccount(int id, double balance, String accountName);
}
