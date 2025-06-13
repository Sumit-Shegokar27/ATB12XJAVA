package Switch;

import java.util.Scanner;

public class Swtich_Automation {

    public static void main(String[] args) {

        Scanner scr= new Scanner(System.in);
        System.out.println(" Enter the Browser ");

        String browser =scr.next();
        browser = browser.toLowerCase();

        switch (browser) {
            case "chrome":
                System.out.println("Starting the chrome");
                System.out.println("........");
                System.out.println("TC1");
                System.out.println("TC2");
                break;
            case "firefox":
                System.out.println("Starting the firefox browser");

                break;
            case "edge":
                System.out.println("Execute the Edge Code");
                break;
            default:
                System.out.println("I have no idea which browser is this");
                break;


        }

    }
}
