package coreClasses;

public class StringBuilderClass {
    public static void main(String[] args) {
        StringBuilder str=new StringBuilder("Hello world");
        System.out.println("str is "+str);
        System.out.println("length "+str.length());
        System.out.println("capacity "+str.capacity());
        System.out.println("welcome "+str.append(" This is vijay"));
        System.out.println("Hi"+str.insert(0,"!"));

        Runtime runtime=Runtime.getRuntime();
        System.gc();
        System.out.println("Total memory before runtime:"+runtime.totalMemory()/(1024*1024));
        System.out.println("free memory before runtime:"+runtime.freeMemory()/(1024*1024));
    }
}
