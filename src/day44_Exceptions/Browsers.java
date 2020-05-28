package day44_Exceptions;

public class Browsers {

    protected void openBrowser() {
        System.out.println("Opening the default browser");
    }

    protected void closeBrowser() {
        System.out.println("Closing default browser");
    }
}
class ChromeBrowser extends Browsers{

    @Override
    public void openBrowser(){
        System.out.println("Opening Chrome Browser");
    }

    @Override
    public void closeBrowser(){
        System.out.println("Closing Chrome Browser");
    }
}

class FirefoxBrowser extends Browsers{
    @Override
    public void openBrowser(){
        System.out.println("Opening Firefox Browser");
    }

    @Override
    public void closeBrowser(){
        System.out.println("Closing Firefox Browser");
    }
}



class Test{
    public static void main(String[] args) {
        ChromeBrowser obj = new ChromeBrowser();
        obj.openBrowser();

        FirefoxBrowser obj2 = new FirefoxBrowser();
        obj2.closeBrowser();
    }

}


/*
	1. create a class called Browsers
			actions: openBrowser(): opens the default browser
					 closeBrowser(): closes the default browser
 */