package day47_Abstraction;

public class FirefoxDriver extends RemoteWebDriver {

    public void get(String URL){
        System.out.println("Opening " + URL + " in Firefox Browser");
    }

    public void quit(){
        System.out.println("Quitting Firefox Browser");
    }
}
