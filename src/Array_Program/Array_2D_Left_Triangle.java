package Array_Program;
import java.util.Scanner;
public class Array_2D_Left_Triangle {




        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            System.out.print("Enter the number of rows for the triangle: ");
            int rows = scanner.nextInt();


            for (int i = 1; i <= rows; i++) {
                // Print spaces first
                for (int j = 1; j <= (rows - i); j++) {
                    System.out.print("  ");
                }


                for (int k = 1; k <= i; k++) {
                    System.out.print("* ");
                }

                // Move to next line
                System.out.println();
            }

            scanner.close();
        }
    }


