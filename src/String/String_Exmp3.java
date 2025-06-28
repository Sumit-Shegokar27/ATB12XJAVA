package String;

public class String_Exmp3 {

    public static void main(String[] args) {

        String s1= " JAVA ".substring(2);
        System.out.println(s1);

        String s2= "Java".substring(1,3);
        System.out.println(s2);

        char [] ch="Java".toCharArray();
        System.out.println(ch);

        String s3= "Java".trim();
        System.out.println(s3);

        boolean b= " ".isBlank();
        System.out.println(b);

        String s4=" ab ".repeat(4);
        System.out.println(s4);

        boolean b2="JAVA".equalsIgnoreCase("java");
        System.out.println(b2);

        String s5=String.format("%s = %d ", "age",25);
        System.out.println(s5);

        long count = "a\nb\nc".lines().count();
        System.out.println(count);
    }
    }

