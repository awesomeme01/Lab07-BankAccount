package com.company;

public class PowerAdvantageAccount extends Account {
    private SavingsAccount savingsAC;
    private CreditCardAccount creditCardAC;

    public PowerAdvantageAccount() {
    }

    public PowerAdvantageAccount(String accountNumber, Account savingsAC, Account creditCardAC) {
        super(accountNumber);
        this.savingsAC = (SavingsAccount) savingsAC;
        this.creditCardAC = (CreditCardAccount) creditCardAC;
    }

    public SavingsAccount getSavingsAC() {
        return savingsAC;
    }

    public void setSavingsAC(SavingsAccount savingsAC) {
        this.savingsAC = savingsAC;
    }

    public CreditCardAccount getCreditCardAC() {
        return creditCardAC;
    }

    public void setCreditCardAC(CreditCardAccount creditCardAC) {
        this.creditCardAC = creditCardAC;
    }
    @Override
    public Double getTotal(){
        return savingsAC.getTotal()-creditCardAC.getTotal();
    }
    @Override
    public String toString() {
        return "Power Advantage A/C Number: "+this.getAccountNumber()+" Balance: $"+String.format("%.2f", this.getTotal())+
                "\n 1."+ savingsAC.toString()+
                "\n 2."+ creditCardAC.toString();

    }
}
