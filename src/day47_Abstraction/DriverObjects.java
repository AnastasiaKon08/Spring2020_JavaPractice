package day47_Abstraction;

public class DriverObjects extends ChromeDriver{
    public static void main(String[] args) {
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.quit();

        System.out.println("===========================");

        FirefoxDriver driver1 = new FirefoxDriver();
        driver1.get("https://www.facebook.com");
        driver1.quit();

        System.out.println("===========================");
        OperaBrowser browser = new OperaBrowser();
        browser.get("https://www.youtube");
        browser.quit();
    }
}
