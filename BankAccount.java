class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;
    public BankAccount(String accountNumber, String accountHolder, double initialBalance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            System.out.println("Initial balance cannot be negative. Setting balance to 0.");
            this.balance = 0;
        }
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Successfully deposited $" + amount + ". Current balance: $" + balance);
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }
    public void withdraw(double amount) {
        if (amount > 0) {
            if (amount <= balance) {
                balance -= amount;
                System.out.println("Successfully withdrew $" + amount + ". Current balance: $" + balance);
            } else {
                System.out.println("Insufficient balance. Withdrawal failed.");
            }
        } else {
            System.out.println("Withdrawal amount must be positive.");
        }
    }
    public void checkBalance() {
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Current Balance: $" + balance);
    }
    public static void main(String[] args) {
        BankAccount a1 = new BankAccount("1234567890", "shahid", 1000.0);
        System.out.println("Initial Account Details:");
        a1.checkBalance();
        System.out.println("\nPerforming deposit of $500...");
        a1.deposit(500.0);
        System.out.println("\nAttempting to withdraw $300...");
        a1.withdraw(300.0);
        System.out.println("\nFinal Account Details:");
        a1.checkBalance();

        BankAccount a2 = new BankAccount("94758475634", "Faisal" , 1300);
        System.out.println("Initial Account Details:");
        a2.checkBalance();
        System.out.println("\nAttempting to withdraw $1500");
        a2.withdraw(1500.0);
        System.out.println("\nAttempting to deposit amount...");
        a2.deposit(100.0);
        System.out.println("\nAttempting to withdraw a negative amount...");
        a2.withdraw(-200.0);
        System.out.println("\nFinal Account Details:");
        a2.checkBalance();
    }
}
