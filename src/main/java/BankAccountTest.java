public class BankAccountTest {
    int accountNumber;
    double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double credit(double addSum) {
        if (addSum < 0) {
            System.out.println("Сумма не может быть отрицательной");
        }
        return balance += addSum;
    }


    public double debit(double minusSum) {
        if (minusSum < 0) {
            System.out.println("Сумма снятия не может быть отрицательной");
        } else if (balance < minusSum) {
            System.out.println("Сумма снятия больше чем остаток на счету!");
        } return balance -= minusSum;
    }
    
    public static void main(String[] args) {
        BankAccount bankaccount = new BankAccount();
        bankaccount.setBalance(300);
        bankaccount.credit(30);
        bankaccount.debit(2);
        System.out.println(bankaccount.balance);
    }
}

