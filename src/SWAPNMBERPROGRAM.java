import java.util.Scanner;

public class SWAPNMBERPROGRAM {

    public static void main(String[] args) {



        System.out.println("Enter the value of x and y");
        Scanner src= new Scanner(System.in);
         int x= src.nextInt();
         int y=src.nextInt();
        System.out.println("Number Before Swapping : "+x+ " "+y);

        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("Number After Swapping :"+x+ " "+y );



    }
}
