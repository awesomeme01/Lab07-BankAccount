package com.company;

public class CreditCardAccount extends Account{
    private Double balance;
    private Double creditLimit;

    public CreditCardAccount(){

    }
    public CreditCardAccount(String accountNumber, Double balance, Double creditLimit) {
        super(accountNumber);
        this.balance = balance;
        this.creditLimit = creditLimit;
    }

    @Override
    public Double getTotal() {
        return this.balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(Double creditLimit) {
        this.creditLimit = creditLimit;
    }

    @Override
    public String toString() {
        return "Credit Card A/C Number: "+this.getAccountNumber()+
                " Balance: $"+String.format("%.2f",this.getTotal())+
                " Credit limit: $"+String.format("%.2f",this.getCreditLimit());
    }
}
