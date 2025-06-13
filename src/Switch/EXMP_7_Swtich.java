package Switch;

public class EXMP_7_Swtich {
    public static void main(String[] args) {

        int itemcode= 006;

        switch (itemcode){
            case 001,002,003:
                System.out.println(" All items are Grocery");
                break;
            case 004,005,006:
                System.out.println(" All items are Computer Parts");
                break;
            default:
                System.out.println("None");

    }
    }
}
