package DesignPatterns.Facade.BankAccountExample;

public class TestBankAccount {

    public static void main(String... args) {
        BankAccountFacade accessingBank =
                new BankAccountFacade(1234567, 1234);

        accessingBank.withdrawCash(50.00);

        accessingBank.withdrawCash(900.00);

        accessingBank.depositCash(200.00);
    }
}