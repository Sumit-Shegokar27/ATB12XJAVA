package Array_Program;

public class Array_Exmp_4 {

    public static void main(String[] args) {

        int[] marks={20,30,50,60,70,80};
        System.out.println(marks.length);
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);
        System.out.println(marks[5]);

        System.out.println( " For Loop Array Data ");

        for (int i=0; i < marks.length; i++){
            System.out.print( marks[i] + " ");
        }

        System.out.println("---------Enhanced For loop------");
        for( int mark :marks ){
            System.out.println(mark);
        }


    }
}
