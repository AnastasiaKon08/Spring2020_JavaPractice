package day41_Inheritance;

public class BankOfAmerica {
    public static void main(String[] args) {
        BankAccount Irina = new BankAccount("Irina", "Li");
        System.out.println(Irina.getAccountHolder());

        System.out.println(Irina.getBalance());
        Irina.depositing(1200);
        Irina.checkBalance();
        Irina.withdrawing(410);
        Irina.checkBalance();

        System.out.println(Irina);


        Irina.withdrawing(800);
        Irina.checkBalance();

    }
}
