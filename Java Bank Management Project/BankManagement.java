import java.util.*;

public class BankManagement {
    public static void main(String[] args) {
        BankSystem bank = new BankSystem();
        bank.loadDummyData(); 
        bank.start();
    }
}

class BankSystem {
    private final Scanner sc = new Scanner(System.in);
    private final List<Account> accounts = new ArrayList<>();

    public void start() {
        while (true) {
            System.out.println("\n------ Indian Bank ------");
            System.out.println("1. Register");
            System.out.println("2. Login");
            System.out.println("3. Exit");
            System.out.print("Choose an option: ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1 : register();break;
                case 2 : login();break;
                case 3 : {
                    System.out.println("Thank you for using Indian Bank.");
                    return;
                }
                default : System.out.println("Invalid choice!");
            }
        }
    }

    private void register() {
        System.out.print("Enter full name: ");
        String name = sc.nextLine();
        int accNo = (int)(Math.random() * 100000);
        System.out.print("Set a 4-digit PIN: ");
        int pin = sc.nextInt();
        System.out.print("Initial deposit amount: ");
        double balance = sc.nextDouble();
        Account acc = new Account(name, accNo, pin, balance);
        accounts.add(acc);
        System.out.println("Account created! Your Account No is: " + accNo);
    }

    private void login() {
        System.out.print("Enter Account No: ");
        int accNo = sc.nextInt();
        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();

        Account acc = findAccount(accNo, pin);
        if (acc == null) {
            System.out.println("Invalid credentials!");
            return;
        }

        boolean session = true;
        while (session) {
            System.out.println("\nWelcome, " + acc.name);
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. View Details");
            System.out.println("4. Apply for Loan");
            System.out.println("5. Repay Loan");
            System.out.println("6. Logout");
            int ch = sc.nextInt();

            switch (ch) {
                case 1 : {
                    System.out.print("Amount to deposit: ");
                    acc.deposit(sc.nextDouble());
                }break;
                case 2 : {
                    System.out.print("Amount to withdraw: ");
                    acc.withdraw(sc.nextDouble());
                }break;
                case 3 : acc.printDetails();break;
                case 4 : {
                    System.out.print("Enter loan amount: ");
                    double amt = sc.nextDouble();
                    System.out.print("Interest rate (%): ");
                    double rate = sc.nextDouble();
                    System.out.print("Duration (years): ");
                    int time = sc.nextInt();
                    acc.applyLoan(amt, rate, time);
                }break;
                case 5 : acc.repayLoan();break;
                case 6 : session = false;break;
                default : System.out.println("Invalid option!");
            }
        }
    }

    private Account findAccount(int accNo, int pin) {
        for (Account acc : accounts) {
            if (acc.accountNo == accNo && acc.pin == pin) return acc;
        }
        return null;
    }

    public void loadDummyData() {
        accounts.add(new Account("Aditya", 12345, 1111, 5000));
        accounts.add(new Account("Lucky", 23456, 2222, 10000));
    }
}

class Account {
    String name;
    int accountNo;
    int pin;
    double balance;
    double loanAmount = 0;
    double repayAmount = 0;
    ArrayList<Transaction> transactions = new ArrayList<>();

    public Account(String name, int accountNo, int pin, double balance) {
        this.name = name;
        this.accountNo = accountNo;
        this.pin = pin;
        this.balance = balance;
    }

    public void deposit(double amt) {
        if (amt > 0) {
            balance += amt;
            transactions.add(new Transaction("Deposit", amt));
            System.out.println("Deposited " + amt);
            System.out.println("Total Balance " + balance);
        }
    }

    public void withdraw(double amt) {
        if (amt > 0 && amt <= balance) {
            balance -= amt;
            transactions.add(new Transaction("Withdraw", amt));
            System.out.println("Withdrawn " + amt);
            System.out.println("Total Balance " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    public void printDetails() {
        System.out.println("\n--- Account Details ---");
        System.out.println("Name: " + name);
        System.out.println("Account No: " + accountNo);
        System.out.println("Balance: " + balance);
        System.out.println("Loan Due: " + repayAmount);
        System.out.println("--- Transactions ---");
        for (Transaction t : transactions) {
            System.out.println(t.type + ": " + t.amount);
        }
    }

    public void applyLoan(double amount, double rate, int years) {
        if (loanAmount > 0) {
            System.out.println("You already have an active loan.");
            return;
        }
        double interest = (amount * rate * years) / 100;
        double total = amount + interest;
        loanAmount = amount;
        repayAmount = total;
        balance += amount;
        transactions.add(new Transaction("Loan Credited", amount));
        System.out.println("Loan approved! You received " + amount);
        System.out.println("Total repayment amount: " + total);
        System.out.println("Total Balance " + balance);
    }

    public void repayLoan() {
        if (repayAmount == 0) {
            System.out.println("No active loan to repay.");
            return;
        }
        if (balance >= repayAmount) {
            balance -= repayAmount;
            transactions.add(new Transaction("Loan Repaid", repayAmount));
            System.out.println("Loan repaid successfully. " + repayAmount + " deducted.");
            System.out.println("Total Balance " + balance);
            loanAmount = 0;
            repayAmount = 0;
        } else {
            System.out.println("Insufficient balance to repay loan.");
        }
    }
}

// Transaction.java
class Transaction {
    String type;
    double amount;

    public Transaction(String type, double amount) {
        this.type = type;
        this.amount = amount;
    }
}

// Demo Test
/*
------ Indian Bank ------
1. Register
2. Login
3. Exit
Choose an option: 1
Enter full name: Prayag sahu
Set a 4-digit PIN: 1234
Initial deposit amount: 2000
Account created! Your Account No is: 64010

------ Indian Bank ------
1. Register
2. Login
3. Exit
Choose an option: 2
Enter Account No: 64010
Enter PIN: 1234

Welcome, Prayag sahu
1. Deposit
2. Withdraw
3. View Details
4. Apply for Loan
5. Repay Loan
6. Logout
1
Amount to deposit: 3000
Deposited 3000.0
Total Balance 5000.0

Welcome, Prayag sahu
1. Deposit
2. Withdraw
3. View Details
4. Apply for Loan
5. Repay Loan
6. Logout
2
Amount to withdraw: 2000
Withdrawn 2000.0
Total Balance 3000.0

Welcome, Prayag sahu
1. Deposit
2. Withdraw
3. View Details
4. Apply for Loan
5. Repay Loan
6. Logout
3

--- Account Details ---
Name: Prayag sahu
Account No: 64010
Balance: 3000.0
Loan Due: 0.0
--- Transactions ---
Deposit: 3000.0
Withdraw: 2000.0

Welcome, Prayag sahu
1. Deposit
2. Withdraw
3. View Details
4. Apply for Loan
5. Repay Loan
6. Logout
4
Enter loan amount: 1000
Interest rate (%): 5
Duration (years): 1
Loan approved! You received 1000.0
Total repayment amount: 1050.0
Total Balance 4000.0

Welcome, Prayag sahu
1. Deposit
2. Withdraw
3. View Details
4. Apply for Loan
5. Repay Loan
6. Logout
3

--- Account Details ---
Name: Prayag sahu
Account No: 64010
Balance: 4000.0
Loan Due: 1050.0
--- Transactions ---
Deposit: 3000.0
Withdraw: 2000.0
Loan Credited: 1000.0

Welcome, Prayag sahu
1. Deposit
2. Withdraw
3. View Details
4. Apply for Loan
5. Repay Loan
6. Logout
5
Loan repaid successfully. 1050.0 deducted.

Welcome, Prayag sahu
1. Deposit
2. Withdraw
3. View Details
4. Apply for Loan
5. Repay Loan
6. Logout
3

--- Account Details ---
Name: Prayag sahu
Account No: 64010
Balance: 2950.0
Loan Due: 0.0
--- Transactions ---
Deposit: 3000.0
Withdraw: 2000.0
Loan Credited: 1000.0
Loan Repaid: 1050.0

Welcome, Prayag sahu
1. Deposit
2. Withdraw
3. View Details
4. Apply for Loan
5. Repay Loan
6. Logout
6

------ Indian Bank ------
1. Register
2. Login
3. Exit
Choose an option:
 */