package BankAccountBalanceValidationSystem;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AccountServiceTest {

    private AccountClass account;
    private AccountService service;

    @BeforeEach
    void setup() {
        account = new AccountClass("12345", "Vivek", 5000);
        service = new AccountService();
    }

    @Test
    void testDepositAmount() {
        double updatedBalance = service.deposit(account, 1000);
        assertEquals(6000, updatedBalance);
    }


    @Test
    void testWithdrawAmount() {
        service.withdraw(account, 2000);
        assertEquals(3000, account.getCurrentBalance());
    }


    @Test
    void testWithdrawMoreThanBalance() {
        boolean result = service.withdraw(account, 6000);
        assertFalse(result);
    }


    @Test
    void testMinimumBalanceValidation() {
        assertTrue(service.checkMinimumBalance(account));
    }
}
