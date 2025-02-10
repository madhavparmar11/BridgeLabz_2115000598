abstract class BankAccount {
    private int balance;
    private int accountNumber;
    private String holderName;

    public BankAccount(int accountNumber, String holderName, int balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }

    public void deposit(int amount) { balance += amount; }
    public void withdraw(int amount) { balance -= amount; }

    public abstract int calculateInterest();
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(int accountNumber, String holderName, int balance) { super(accountNumber, holderName, balance); }
    public int calculateInterest() { return (int) (super.calculateInterest() * 0.04); }
}

interface Loanable {
    int applyForLoan();
}

class Banking {
    public static void main(String[] args) {
        BankAccount[] accounts = { new SavingsAccount(1, "John", 1000) };
        for (BankAccount account : accounts) {
            System.out.println(account.calculateInterest());
        }
    }
}
