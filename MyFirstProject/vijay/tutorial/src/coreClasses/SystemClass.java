package coreClasses;

import java.io.IOException;

public class SystemClass {
    public static void main(String[] args) {
        System.out.println("hello");
        System.err.println("error");
        long startTime=System.currentTimeMillis();

        System.out.println(System.getProperty("java.version"));
        System.out.println(System.getProperty("java.vendor"));
        System.setProperty("java.demo","core java");
        System.out.println(System.getProperty("java.demo"));

        try {
            System.out.println("enter the character");
            char c=(char)System.in.read();
            System.out.println("the char c is "+c);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        long endTime=System.currentTimeMillis();
        System.out.println("the time taken ="+(endTime-startTime));
       // System.out.println(" the user input is"+fetTestUserInput());
    }
    public static String fetTestUserInput(){
        StringBuffer sb=new StringBuffer();
        try {
            System.out.println("Enter the string:");
            char d=(char)System.in.read();
            while (d!='\n'){
                sb.append(d);
                d=(char)System.in.read();
            }
            System.out.println("the value of ch is"+d);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return sb.toString();
    }
}
