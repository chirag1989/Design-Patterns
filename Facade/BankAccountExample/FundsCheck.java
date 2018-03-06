package DesignPatterns.Facade.BankAccountExample;

public class FundsCheck {

    private double cashInAccount = 1000.00;

    public double getCashInAccount() {
        return cashInAccount;
    }

    public void decreaseCashInAccount(double cashWithDrawn) {
        cashInAccount -= cashWithDrawn;
    }

    public void increaseCashInAccount(double cashDeposited) {
        cashInAccount += cashDeposited;
    }

    public boolean haveEnoughMoney(double cashToWithdraw) {
        if (cashToWithdraw > cashInAccount) {
            System.out.println("Not enough balance. Current balance: " + cashInAccount);
            return false;
        }
        else {
            decreaseCashInAccount(cashToWithdraw);
            System.out.println("Withdraw complete. Current balance: " + cashInAccount);
            return true;
        }
    }

    public void makeDeposit(double cashToDeposit) {
        increaseCashInAccount(cashToDeposit);
        System.out.println("Cash deposited. Current balance: " + cashInAccount);
    }
}
