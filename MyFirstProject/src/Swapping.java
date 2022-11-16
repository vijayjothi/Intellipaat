import java.util.Scanner;

public class Swapping {
    public static void main(String[] args) {
        int x,y,temp;
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter the values of x and y: ");
        x=scan.nextInt();
        y=scan.nextInt();
        System.out.println("Before swapping: \n x:"+x+"\n y:"+y);
        //with temporary variable
        temp=x;
        x=y;
        y=temp;

        System.out.println("After swapping: \n x:"+x+"\n y:"+y);

        //without using third variable
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("After swapping W/O: \n x:"+x+"\n y:"+y);
    }
}
