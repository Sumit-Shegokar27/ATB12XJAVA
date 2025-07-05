package Assigment_Test_07_5_2025;

public class Try_Catch_finally_Program {

    public static void main(String[] args) {
        int num = 10;
        int denom = 0;

        try {
            int result = num/ denom;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Cannot divide by zero.");
        } finally {
            System.out.println("Finally block executed.");
        }

        System.out.println("Program continues...");
    }
}
