package BankAccountBalanceValidationSystem;

public class AccountService {


    private static final double MIN_BALANCE = 1000;

    public double deposit(AccountClass account, double amount) {

        if (amount <= 0) {
            throw new IllegalArgumentException("Deposit must be greater than 0");
        }

        account.setCurrentBalance(account.getCurrentBalance() + amount);
        return account.getCurrentBalance();
    }

    public boolean withdraw(AccountClass account, double amount) {

        if (amount <= account.getCurrentBalance()) {
            account.setCurrentBalance(account.getCurrentBalance() - amount);
            return true;
        }

        return false;
    }

    public boolean checkMinimumBalance(AccountClass account) {
        return account.getCurrentBalance() >= MIN_BALANCE;
    }
}
