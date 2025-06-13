package Switch;

import java.util.Scanner;

public class Swtich_WithoutBreak {

    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);

        System.out.println("Enter the day to 1 to 7");



            int day = scr.nextInt();

            switch (day) {
                case 1:
                    System.out.println("Monday");

                case 2:
                    System.out.println("Tuesday");

                case 3:
                    System.out.println("Wensday");

                case 4:
                    System.out.println("Thursday");

                case 5:
                    System.out.println("Friday");

                case 6:
                    System.out.println("Saturday");
                    break;

                case 7:
                    System.out.println("Sunday");

                default:
                    System.out.println(" Enter int number from 1 to 7 only  ");


            }

        }
    }

