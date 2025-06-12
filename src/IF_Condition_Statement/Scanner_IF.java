package IF_Condition_Statement;

import java.util.Scanner;

public class Scanner_IF {

    public static void main(String[] args) {

        System.out.println(" Enter  the Age : ");
        Scanner scr= new Scanner(System.in);
        int age =scr.nextInt();

        if( age > 18){
            System.out.println(" He/She can  vote");
        }
        else
        {
            System.out.println(" Can not Vote ");
        }
    }
}
