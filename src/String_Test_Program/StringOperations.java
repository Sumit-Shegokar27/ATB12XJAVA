package String_Test_Program;

public class StringOperations {

    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "World";


        String concatenated = str1 + " " + str2;
        System.out.println("Concatenated String: " + concatenated);


        int length = concatenated.length();
        System.out.println("Length of Concatenated String: " + length);


        String sub = concatenated.substring(6, 11);  // "World"
        System.out.println("Substring (6, 11): " + sub);


        char ch = concatenated.charAt(1);  // 'e'
        System.out.println("Character at index 1: " + ch);
    }
}


