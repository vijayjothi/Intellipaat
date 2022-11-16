import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=scanner.nextInt();

        int remainder,sum=0,temp;
        temp=num;
        while(num>0){
            remainder=num%10; //getting remainder 4
            sum=(sum*10)+remainder; //sum 4
            num=num/10; //45
        }
        if(temp==sum){
            System.out.println("It is a palindrome number");
        }else {
            System.out.println("Its not a palindrome number");
        }
    }
}
