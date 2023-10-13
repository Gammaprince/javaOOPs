/*
Encapsulation is the concept of wrapping the data (variables) and the code (methods) that operate on the data into a single unit known as a class. 
It helps in data hiding and ensures that the internal representation of an object is hidden from the outside world.
*/

//Example of Encapsulation
class BankAccount {
    private double balance; // Private variable, accessible only within the class

    // Public setter method to set the balance
    public void setBalance(double balance) {
        // Validation logic can be applied here
        if (balance >= 0) {
            this.balance = balance;
        } else {
            System.out.println("Invalid balance amount");
        }
    }

    // Public getter method to get the balance
    public double getBalance() {
        return balance;
    }
}

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        account.setBalance(1000); // Setting the balance using the setter method

        // Trying to access the balance directly (which is private) will result in a compilation error
        // account.balance = 2000; // Error: balance has private access in BankAccount

        double currentBalance = account.getBalance(); // Getting the balance using the getter method
        System.out.println("Current Balance: " + currentBalance);
    }
}
