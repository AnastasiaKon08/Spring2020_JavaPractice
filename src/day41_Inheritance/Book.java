package day41_Inheritance;

public class Book {
    public String title;
    public String author;
    public double price;

    public String toString(){
        return title + " by " + author +", price: $" + price;
    }

}
