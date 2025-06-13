package For_Loop;

public class LOOP_Continue_ODD {
    public static void main(String[] args) {

        for(int i=1; i< 50; i++){
            if(i % 2 == 0){
                continue;
            }
            System.out.println("ODD Number : > " + i);
        }
    }
}
