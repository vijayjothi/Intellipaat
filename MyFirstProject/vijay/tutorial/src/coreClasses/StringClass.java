package coreClasses;

public class StringClass {
    public static void main(String[] args) {
        String s1="Hello world";
        String s2="Hello world";
        String s3=new String("Hello world");

        Runtime runtime=Runtime.getRuntime();
        System.gc();
        System.out.println("Total memory before runtime:"+runtime.totalMemory()/(1024*1024));
        System.out.println("free memory before runtime:"+runtime.freeMemory()/(1024*1024));

        System.out.println("length "+s1.length());
        System.out.println("substring "+s2.substring(6));
        String s[]=s1.split(" ");
        for (String str:s){
            System.out.println(str);
        }

        if (s1==s2) System.out.println("true");
        else System.out.println("false");

        if (s1==s3) System.out.println("true");
        else System.out.println("false");
    }
}
