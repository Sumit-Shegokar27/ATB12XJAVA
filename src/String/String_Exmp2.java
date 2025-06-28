package String;

public class String_Exmp2 {
    public static void main(String[] args) {

        String s= "Hello";
        char c= s.charAt(2);
        System.out.println(c);

        System.out.println(s.codePointAt(0));

        int idk=" Java".indexOf("a");
        System.out.println(idk);

        int idk2="Java".lastIndexOf("a");
        System.out.println(idk2);

        boolean b="".isEmpty();
        System.out.println(b);

        String s11=String.join(" z "," JAVA " , " Phyton ");
        System.out.println(s11);

        String s12="Java".replace("a", "o");
        System.out.println(s12);

        boolean b1= "JAVA".startsWith("JA");
        System.out.println(b1);
    }
}
