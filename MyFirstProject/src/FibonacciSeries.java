import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        int n1=0,n2=1,n3;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the count:");
        int count=scanner.nextInt();

        System.out.print(n1+" "+n2);
        for (int i=2;i<=count;++i){
            n3=n2+n1;
            System.out.print(" "+n3);
            n1=n2;
            n2=n3;
        }
    }
}
