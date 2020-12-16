import org.junit.*;
public class JUnitTestFirst {
    private BankAccount bankaccount;

    @Before
    public void setUp() {bankaccount = new BankAccount();}

    @Test
    public void testBalanceChanges() {
        bankaccount.balance = 200;
        double addSum = 20;
        double actualResult = bankaccount.credit(addSum);
        Assert.assertEquals(250,actualResult, 10);
    }

    @Test
    public void testBalanceMinus() {
        bankaccount.balance = 300;
        double minusSum =500;
        double actualResult = bankaccount.debit(minusSum);
        Assert.assertEquals (20, actualResult, 10);
    }

    @Test
    public void testBalanceNegativeValue() {
        bankaccount.balance = 300;
        double minusSum1= -120;
        double actualResult = bankaccount.debit(minusSum1);
        Assert.assertEquals(180, actualResult, 10);
    }

    @Test
    public void testBalanceNotNull() {
        bankaccount.balance = 300;
        double minusSum2 = 300;
        double actualResult = bankaccount.debit(minusSum2);
        Assert.assertEquals(35, actualResult, 10);
    }
}


