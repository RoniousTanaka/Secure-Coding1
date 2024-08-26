//creating a Bank class
class Bank {
    private String accountType;
    private double accountBalance;

    // Constructor
    public Bank(String accountType, double accountBalance) {
        this.accountType = accountType;
        this.accountBalance = accountBalance;
    }

    // Deposit method
    public double deposit(double amount) {
        accountBalance += amount;
        return accountBalance;
    }

    // Withdrawal method
    public double withdrawal(double amount) {
        if (amount <= accountBalance) {
            accountBalance -= amount;
            return accountBalance;
        } else {
            System.out.println("Insufficient balance");
            return -1; // Indicate insufficient balance
        }
    }

    // Display method
    public void display() {
        System.out.println("The account type is " + accountType + " and the balance is " + accountBalance);
    }
}
    // Main method (for testing)
public class Main {
        public static void main(String[] args) {
            // Create an instance of the Bank class
            String initials = "RONIOUS TANAKA CHAPEYAMA"; // Replace with your initials
            double regNumber = 230725; // Replace with your registration number
            Bank myBankAccount = new Bank(initials, regNumber);

            // Invoke the display method
            myBankAccount.display();
        }
    }
