package Array_Program;

import java.util.Scanner;

public class Array_User_Input {
    public static void main(String[] args) {

        Scanner scr = new Scanner(System.in);
        System.out.println(" enter  the Array Size");

        int size = scr.nextInt();;

        String [] number_marks= new String[size];

        for(int i= 0; i < number_marks.length; i++){
            System.out.println(" enter the element > " + i);
            number_marks[i]= scr.next();
        }
        System.out.println(" --- Print the values");

        for(String marks : number_marks){
            System.out.println(marks);
        }

        scr.close();

    }
}
