package coreClasses;

public class Wrapper {
    public static void main(String[] args) {
        int i=10;
        Integer integer=new Integer(5);
        integer=i; //autoboxing
        System.out.println(integer);
        i=integer;//unboxing
        System.out.println(i);

        System.out.println("sum of n integers is "+checkSum(1,2,3));
        System.out.println("sum of n integers is "+checkSum(1,2,3,4,5,6));

        String fname="hello";
        String lname="world";
        System.out.println("first name is "+fname+" last name is "+lname);
        System.out.format("first name is %s\nthe last name is %s\nand display the name %s\n",fname,lname,(fname+"_"+lname));

    }
    public static int checkSum(int... vals){ //variable argument
        int sum=0;
        for (int i:vals){
            sum+=i;
        }
        return sum;
    }
}
