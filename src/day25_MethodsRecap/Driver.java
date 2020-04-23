package day25_MethodsRecap;

public class Driver {

    public static String getDriver1(String browserName){
        String result="";
        switch (browserName.toLowerCase()){
            case "chrome": return "Chrome Driver";
            case "firefox": return "Firefox Driver";
            case "safari": return "Safari Driver";
            case "opera" : return "Opera Driver";
            case "edge" : return "Edge Driver";
            default: return "Invalid Driver";
        }
    }

    public static void main(String[] args) {
        String str = getDriver1("chrome"); // argument is mandatory
        System.out.println(str);
    }
}


/*
1. write a return method named getDriver1 that accepts a string parameter called Browser
				if the browser name matches with {"chrome", "firefox", "id", "safari", "edge", "Opera"}, then it returns the name of that specific browser' driver
					Ex: getDriver("chrome");  ==> "Chrome Driver"
						getDriver("fireFOX"); ==> "FireFox Driver"
 */