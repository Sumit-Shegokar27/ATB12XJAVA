package Array_Program;

import java.util.Scanner;

public class Array_2D_Right_Traingle {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println(" Enter the numner eg = 3");
        int n = scr.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        scr.close();
    }
}

        /*Scanner scanner = new Scanner(System.in);

        // Prompt user to enter number of rows
        System.out.print("Enter the number of rows for the triangle: ");
        int rows = scanner.nextInt();

        // Print right-angled triangle using nested for loops
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        scanner.close();
    }
    }*/

