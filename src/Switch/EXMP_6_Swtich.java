package Switch;

public class EXMP_6_Swtich {

    public static void main(String[] args) {

        int itemcode=001;

        switch (itemcode){
            case 1 :
                System.out.println(" 001");
                break;
            case 2 :
                System.out.println(" 002");
            case 3 :
                System.out.println(" 003");
            case 4 :
                System.out.println(" 004");
            default:
                System.out.println("Default value");
        }
    }
}
