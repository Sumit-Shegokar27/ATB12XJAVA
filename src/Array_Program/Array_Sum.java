package Array_Program;

public class Array_Sum {
    public static void main(String[] args) {

        int [] number ={12,30,50};
        int sum=0;

        for(int i= 0 ; i< number.length;i++){
            sum=sum+number[i];

        }
        System.out.println(" Sum of Number : " + sum);
    }
}
