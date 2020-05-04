package day33_CustomClass;

public class CapitalOne {
    public static void main(String[] args) {
        BankAccount capitalOne = new BankAccount();
        capitalOne.setAccInfo("Ana Jones", "56439260", 25649.87);
        capitalOne.checkingBalance();
        capitalOne.withdraw(6078.45);
        capitalOne.checkingBalance();
        capitalOne.deposit(1000);
        capitalOne.checkingBalance();
        System.out.println(capitalOne);

    }
}
