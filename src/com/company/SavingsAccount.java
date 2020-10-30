package com.company;

public class SavingsAccount extends Account{
    private Double balance;

    public SavingsAccount() {
    }

    public SavingsAccount(String accountNumber, Double balance) {
        super(accountNumber);
        this.balance = balance;
    }

    @Override
    public Double getTotal() {
        return this.balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "Savings A/C Number: "+ this.getAccountNumber()+
                " Balance: $"+String.format("%.2f", this.getTotal());
    }
}
