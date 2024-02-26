import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BankTest {

    @Test
    public void testInitialBalance() {
        Bank bank = new Bank("MyBank");
        assertEquals(0, bank.getBalance());
    }

    @Test
    public void testDeposit() {
        Bank bank = new Bank("MyBank");
        assertTrue(bank.deposit(100));
        assertEquals(100, bank.getBalance());
    }

    @Test
    public void testNegativeDeposit() {
        Bank bank = new Bank("MyBank");
        assertFalse(bank.deposit(-50));
        assertEquals(0, bank.getBalance());
    }

    @Test
    public void testWithdraw() {
        Bank bank = new Bank("MyBank");
        bank.deposit(200);
        assertTrue(bank.withdraw(100));
        assertEquals(100, bank.getBalance());
    }

    @Test
    public void testInsufficientWithdraw() {
        Bank bank = new Bank("MyBank");
        bank.deposit(50);
        assertFalse(bank.withdraw(100));
        assertEquals(50, bank.getBalance());
    }
}
