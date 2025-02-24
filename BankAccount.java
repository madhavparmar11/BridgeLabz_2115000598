import org.junit.jupiter.api.*;

class BankAccount {
    private double balance = 0;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (balance >= amount) balance -= amount;
        else throw new IllegalArgumentException("Insufficient funds");
    }

    public double getBalance() {
        return balance;
    }
}

public class BankAccountTest {
    private BankAccount account;

    @BeforeEach
    void setUp() {
        account = new BankAccount();
    }

    @Test
    void testDeposit() {
        account.deposit(100);
        Assertions.assertEquals(100, account.getBalance());
    }

    @Test
    void testWithdraw() {
        account.deposit(200);
        account.withdraw(50);
        Assertions.assertEquals(150, account.getBalance());
    }

    @Test
    void testWithdrawInsufficientFunds() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> account.withdraw(50));
    }
}
