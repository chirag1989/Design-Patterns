package DesignPatterns.Facade.BankAccountExample;

public class AccountNumberCheck {

    private int accoutNumber = 1234567;

    public int getAccoutNumber() {
        return accoutNumber;
    }

    public boolean accountActive(int accoutNumberToCheck) {
        return accoutNumberToCheck == accoutNumber;
    }
}
