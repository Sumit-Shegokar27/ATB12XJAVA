package StringBulider_StringBuffer;

public class StringBulider_VS_Buffer {

    public static void main(String[] args) {

        String s1 ="Sumit";
        String s2 = new String("Shegokar");

        StringBuffer stringBuffer= new StringBuffer("Sumit");
        StringBuilder stringBuilder= new StringBuilder("Amit");

        System.out.println(stringBuffer);
        System.out.println(stringBuilder);
        System.out.println(stringBuffer.reverse());
        System.out.println(stringBuilder.reverse());
    }
}
