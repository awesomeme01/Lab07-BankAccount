package com.company;

public abstract class Account {
    private String accountNumber;
    public Account(){

    }
    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public abstract Double getTotal();

    @Override
    public String toString()
    {
        return "Bank A/C Number: "+getAccountNumber();
    }
}
