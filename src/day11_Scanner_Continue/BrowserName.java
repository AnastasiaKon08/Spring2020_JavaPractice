package day11_Scanner_Continue;

public class BrowserName {
    public static void main(String[] args) {
        String name = "Fre";

        switch(name){
            case "firefox":
            case "Firefox":
                System.out.println("Firefox is about to open");
                break;

            case "Opera":
            case "opera":
                System.out.println("Opera is about to open");
                break;

            case "Safari":
            case "safari":
                System.out.println("Safari is about to open");
                break;

            case "Chrome":
            case "chrome":
                System.out.println("Chrome is about to open");
                break;

            default:
                System.out.println("Invalid Browser name");

        }


    }
}
/* write a program that can display the selected browser
                        1. declear a String variable called browserName
                        2. Assume that the valid browsers are: chrome, firefox, opera, safari.
                        3. if the browser name does not match with the valid browsers' names, out put should be: Invalid Browser Name
            Note: Do Not use scanner or if statement or ternary for this task

 */