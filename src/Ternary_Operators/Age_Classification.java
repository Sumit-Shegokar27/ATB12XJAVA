package Ternary_Operators;

import java.util.Scanner;

public class Age_Classification {

    public static void main(String[] args) {

       /* String user_input = args[0];
        System.out.println(user_input instanceof String);
        System.out.println(user_input);

        int age = Integer.parseInt(user_input); // NumberFormatException: For input string: "pramod"
        System.out.println(age);*/

        Scanner scr= new Scanner(System.in);
        System.out.println(" Enter the Number "+ scr);
        int age = scr.nextInt();
        String result = (age < 18) ? "Minor" : ( age < 65) ? "Adult" : "Senior Citizen";
        System.out.println(result);

    }
}
