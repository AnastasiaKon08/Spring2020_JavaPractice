package day41_Inheritance;

public class BankAccount {

    public static String bankName = "Bank of America";
    public String firstName;
    public String lastName;

    private String accountHolder;
    private long accountNumber;
    private double balance;

    public BankAccount (String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountHolder = firstName + " " + lastName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }


    public String getAccountHolder(){
        return accountHolder;
    }

    public void setAccountHolder(String firstName, String  lastName){
        accountHolder = firstName+ "  "+ lastName;
    }

    public void depositing(double amount){
        balance+= amount;
    }

    public void withdrawing(double amount){
        setBalance(balance- amount);
    }

    public void checkBalance(){
        System.out.println("Available Balance: " + getBalance());
    }

    public String toString(){
        return "Account Holder: " + accountHolder + "\nAccount Number: " + getAccountNumber() + ", available balance: " + getBalance();
    }





}
