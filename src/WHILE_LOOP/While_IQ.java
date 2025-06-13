package WHILE_LOOP;

import java.util.Scanner;

public class While_IQ {

    public static void main(String[] args) {

        Scanner scr =new Scanner(System.in);
        System.out.println("Welcome to Factorial Program");
        System.out.println("Enter the number, whose factorial you want!");

        if(!scr.hasNextInt()){
            System.out.println(" Enter the int , rerun the code");


        }
        int num= scr.nextInt();
        int fact= 1;

     if ( num == 0){
         System.out.println(" fact  is : " + fact);
     }

     if(num > Integer.MAX_VALUE){
         System.out.println("Can't get the factorial as out of bound!(int)");
     }

     int i=1;
     while (i<=num){
         fact =fact*i;
         i++;

     }
        System.out.println(" fact is : " + fact);

    }


}
