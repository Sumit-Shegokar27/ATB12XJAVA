package Switch;

import java.util.Scanner;

public class Exmp2_Swtich {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.println("Enter the day to 1 to 7");


        int day = scr.nextInt();

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;

            case 2:
                System.out.println("Tuesday");
                break;
        }
    }
}
