package Assigment_Test_07_5_2025;

public class Catch_Mulitple_Expections {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30};
        int index = 5;
        int divisor = 0;

        try {

            int value = numbers[index];

            int result = value / divisor;

            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught exception: Array index is out of bounds.");
        } catch (ArithmeticException e) {
            System.out.println("Caught exception: Cannot divide by zero.");
        } finally {
            System.out.println("Finally block executed.");
        }

        System.out.println("Program continues...");
    }
}
