package Array_Program;

public class Array_Max_Min {
    public static void main(String[] args) {

        int [] marks={55,45,56,88,55,96,75,36,89,64,78};
        int max= marks[0];
        int min =marks[0];

       /* for(int i=0; i < marks.length;i++){
            if(marks[i] > max){
                max=marks[i];

            }
        }

        System.out.println(" Maximum Marks : " + max);

        */

        for(int i=0; i < marks.length;i++){
            if(marks[i] < min){
                min=marks[i];

            }
        }

        System.out.println(" Minimum Marks : " + min);

    }
}
