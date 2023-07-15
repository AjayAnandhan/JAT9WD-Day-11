package Tasks;

// Q4)


public class Account {
    private double balance;


    public Account() {
        balance = 0.0;
    }

    public Account(double initialBalance) {
        balance = initialBalance;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: Rs" + amount);
        } else {
            System.out.println("Invalid deposit amount. Amount must be greater than 0.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance >= amount) {
                balance -= amount;
                System.out.println("Withdrawn: RS" + amount);
            } else {
                System.out.println("Insufficient funds. Unable to withdraw Rs" + amount);
            }
        } else {
            System.out.println("Invalid withdrawal amount. Amount must be greater than 0.");
        }
    }

    public static void main(String[] args) {
        Account account1 = new Account(); 
        Account account2 = new Account(100.0); 

        System.out.println("Account 1 balance: Rs" + account1.getBalance());
        System.out.println("Account 2 balance: Rs" + account2.getBalance());

        account1.deposit(50.0);
        account2.withdraw(30.0);

        System.out.println("Account 1 balance: Rs" + account1.getBalance());
        System.out.println("Account 2 balance: Rs" + account2.getBalance());
    }
}
