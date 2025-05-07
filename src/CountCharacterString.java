public class CountCharacterString {

    public static void main(String[] args) {
        String str="Becomes a Job Ready with Pramod Datta";

        int count=0;

        for(int i=0;i<str.length();i++)
        {
            if(str.charAt(i)!=' '){
                count++;

            }

        }
        System.out.println("total number of Character in String is : " + count);
    }
}
