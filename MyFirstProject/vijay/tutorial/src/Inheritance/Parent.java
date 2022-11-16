package Inheritance;

public class Parent {
    String name;
    int id;
    Parent(){
        System.out.println("parent constructor");
    }


    public Parent(String name, int id) {
        System.out.println("double arg parent constructor");
        this.name = name;
        this.id = id;
    }

    public Parent(int id) {
        System.out.println("single arg parent constructor");
        this.id = id;
    }

    public int getIdSquare(){
        return id*id;
    }
}
