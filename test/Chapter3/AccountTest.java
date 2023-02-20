package Chapter3;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTest {
    @Test
    public void testThatObjectAccountExist(){
        Account account = new Account("ik", 5000.0, "12345");
        assertNotNull(account);
    }
    @Test
    public void testThatICanDeposit(){
        Account account = new Account("ik", 5000.0, "12345");
        account.deposit(1000.0);
        assertEquals(6000.0, account.getBalance());
    }
    @Test
    public void testThatICanNotWithdrawIfAmountExitBalance(){
        Account account = new Account("ik", 5000.0, "12345");
        account.withdraw(5000.0);
        assertEquals(000.0, account.getBalance());

    }
}