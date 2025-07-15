package OPP_Constructors;

public class Con_Exmp2 {
    public static void main(String[] args) {
        A a1=new A();
        System.out.println(a1);
    }
}

class A{
    A(){
        System.out.println("Obect is created");
        System.out.println(" CSV file read");
        System.out.println(" we can read a file");
    }
}
