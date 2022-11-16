package coreClasses;

public class ClassDemo {
    public static void main(String[] args) {
        String str="vijay";
        Class testclass=str.getClass();
        System.out.println("Class name is "+testclass.getName());

        try {
            Class testClass2=Class.forName("coreClasses.ObjectDemo");
            System.out.println(testClass2);

            ObjectDemo object=(ObjectDemo) testClass2.newInstance();
            object.val=50;
            object.info="vijay";
            System.out.println(object.val+" "+object.info);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
