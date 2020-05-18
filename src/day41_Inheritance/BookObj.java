package day41_Inheritance;

public class BookObj {

    public static void main(String[] args) {
        Ebook book1 = new Ebook();

        book1.title = "Hamlet";
        book1.author = "William Shakespeare";
        book1.price = 20;
        System.out.println(book1);
        book1.size = "1.5MB";
        System.out.println(book1.size);
        book1.pages = 120;
        System.out.println(book1.pages);
        book1.readbook();
        System.out.println("===================");

        AudioBook book2 = new AudioBook();
        book2.title = "Becoming";
        book2.author = "Michelle Obama";
        book2.price = 18;
        book2.listen();
        System.out.println(book2);
    }
}
