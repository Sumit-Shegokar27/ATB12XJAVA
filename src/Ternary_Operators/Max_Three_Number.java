package Ternary_Operators;

public class Max_Three_Number {

    public static void main(String[] args) {
        int a=-20;
        int b=-80;
        int c=-50;

        int max= (a > b) ? (a > c) ? a : c : ( (b > c ) ? b : c) ;

        System.out.println( " Maxium number is : " + max);
    }
}
