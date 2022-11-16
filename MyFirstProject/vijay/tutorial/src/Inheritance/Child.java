package Inheritance;

public class Child extends Parent{
    int childId;
    String childName;
    Child(){
        System.out.println("child constructor");
    }

    public Child(int childId) {
        System.out.println("Single arg child constructor");
        this.childId = childId;
    }

    public static void main(String[] args) {
        Child child=new Child();
        child.childId=1;
        child.childName="vijay";
        System.out.format("child id %d child name %s\n\n",child.childId,child.childName);

        Child child1=new Child(100);
        child1.childName="vj";
        System.out.format("child id %d child name %s\n\n",child.childId,child.childName);

    }
}
