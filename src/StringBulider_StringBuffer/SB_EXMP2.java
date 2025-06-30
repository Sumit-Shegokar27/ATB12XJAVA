package StringBulider_StringBuffer;

public class SB_EXMP2 {
    public static void main(String[] args) {

        StringBuffer sb= new StringBuffer("Java");
        sb.append(" Programming");
        System.out.println(sb);

       // sb.delete(5,10);
        //System.out.println(sb);

        sb.replace(0,4,"C++");
        System.out.println(sb);
    }
}
