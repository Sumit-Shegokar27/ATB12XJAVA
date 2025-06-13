package Switch;

import javax.swing.*;
import java.util.Scanner;

public class EXMP1_Swtich {

    public static void main(String[] args) {


        Scanner scr = new Scanner(System.in);

        System.out.println("Enter the day to 1 to 7");
        if (scr.hasNext())
        {


            int day = scr.nextInt();

            switch (day) {
                case 1:
                    System.out.println("Monday");
                    break;
                case 2:
                    System.out.println("Tuesday");
                    break;
                case 3:
                    System.out.println("Wensday");
                    break;
                case 4:
                    System.out.println("Thursday");
                    break;
                case 5:
                    System.out.println("Friday");
                    break;
                case 6:
                    System.out.println("Saturday");
                    break;
                case 7:
                    System.out.println("Sunday");
                    break;
                default:
                    System.out.println(" Enter int number from 1 to 7 only  ");


            }

        }
        else
        {
            System.out.println(" Please Enter valid Integer for days");
        }
    }
}