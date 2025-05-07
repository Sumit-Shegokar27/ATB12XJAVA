import java.sql.SQLOutput;

public class FabonacciSeries {
    public static void main(String[] args) {

        int n=10,fristTerm=0,secondTerm=1;

        System.out.println("Fabonacci Series till " + n + " Trems");

        for(int i=1;i<=n;++i)
        {
            System.out.print(fristTerm + " ");
            int nextTerm=fristTerm+secondTerm;
            fristTerm=secondTerm;
            secondTerm=nextTerm;
        }
    }
}
