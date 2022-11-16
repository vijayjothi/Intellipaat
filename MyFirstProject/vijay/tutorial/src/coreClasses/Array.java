package coreClasses;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] intArr=new int[]{1,2,3};
        for (int a:intArr){
            System.out.println("Value of arr "+a);
        }

        int[][] twoDArr=new int[2][];
        twoDArr[0]=new int[]{1,2,3,4};
        twoDArr[1]=new int[]{2,5};
        for (int[] i:twoDArr){
            for (int j:i){
                System.out.print(" "+j);
            }
            System.out.println(" ");
        }

        intArr= Arrays.copyOf(intArr,6);
        for (int a:intArr){
            System.out.println(" after copy "+a);
        }
        System.out.println();

        intArr= Arrays.copyOfRange(intArr,2,6);
        for (int a:intArr){
            System.out.println(" after copy "+a);
        }
    }
}
