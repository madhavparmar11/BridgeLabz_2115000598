import java.util.*;

class Account {
    int number;
    int balance;

    Account(int number, int balance) {
        this.number = number;
        this.balance = balance;
    }
}

public class BankingSystem {
    HashMap<Integer, Account> accounts = new HashMap<>();
    TreeMap<Integer, Account> sortedAccounts = new TreeMap<>();
    Queue<Account> withdrawals = new LinkedList<>();

    void addAccount(Account account) {
        accounts.put(account.number, account);
        sortedAccounts.put(account.balance, account);
    }

    void requestWithdrawal(int number) {
        withdrawals.add(accounts.get(number));
    }

    public static void main(String[] args) {
        BankingSystem system = new BankingSystem();
        system.addAccount(new Account(1, 5000));
        system.addAccount(new Account(2, 10000));
        system.requestWithdrawal(1);
    }
}
