package Array_Program;

import java.util.Arrays;

public class Interview_QUE_2_3_4_Highest_Number {
    public static void main(String[] args) {

        int [] number={10,30,55,77,58,89};

        Arrays.sort(number);
        System.out.println(number[number.length -2]);
        System.out.println(number[number.length -4]);
        System.out.println(number[number.length -3]);
    }
}
