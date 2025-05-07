public class ReverStrringCode {
    public static void main(String[] args) {

        String string="Sumit";
        String revstring="";

        for(int i=string.length()-1;i>=0;i--)
        {
            revstring=revstring+string.charAt(i);
        }
        System.out.println("Orginal String :" + string);
        System.out.println("Revers String :"+ revstring);
    }
}
