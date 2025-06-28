package String_Test_Program;

public class StringCompare {

        public static void main(String[] args) {
            String s1 = "Java";
            String s2 = "Java";
            String s3 = new String("Java");
            String s4 = "java";


            System.out.println("s1 == s2: " + (s1 == s2));
            System.out.println("s1 == s3: " + (s1 == s3));


            System.out.println("s1.equals(s3): " + s1.equals(s3));


            System.out.println("s1.equalsIgnoreCase(s4): " + s1.equalsIgnoreCase(s4));


            System.out.println("s1.compareTo(s2): " + s1.compareTo(s2));
            System.out.println("s1.compareTo(s4): " + s1.compareTo(s4));
            System.out.println("s4.compareTo(s1): " + s4.compareTo(s1));
        }
    }


