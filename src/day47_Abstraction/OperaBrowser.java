package day47_Abstraction;

public class OperaBrowser extends RemoteWebDriver{
    @Override
    protected void get(String URL) {
        System.out.println("Opening "+ URL + " in Opera");
    }

    @Override
    public void quit() {
        System.out.println("Quitting Opera Browser");

    }
}
