import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=scanner.nextInt();
        int count=0;

        for (int i=1;i<=num;i++){
            if (num%i==0){
                count++;
            }
        }
        if (count==2){
            System.out.println("It is a prime number");
        }else {
            System.out.println("It's not a prime number");
        }
    }
}
