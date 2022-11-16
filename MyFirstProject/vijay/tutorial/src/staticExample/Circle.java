package staticExample;

public class Circle {
    public static double pi=3.14;
     int radius;

    public Circle(int radius) {
        System.out.println("Constructor");
        this.radius = radius;
    }

    static {
        System.out.println("static block");
    }

    {
        System.out.println("block");
    }
    public static double areaOfCircle(){
        return pi;
    }

    public static void main(String[] args) {
        Circle c1=new Circle(10);
        Circle c2=new Circle(10);
        int a=10;
        int b=10;

        System.out.println("Circle c1:"+c1);
        System.out.println("Circle c2:"+c2);
        System.out.println("comparing c1 and c2: "+c2.equals(c1));
        System.out.println("comparing c1 and c2: "+(c2==c1));
        System.out.println("comparing a and b :"+(a==b));
        c2=c1;
        System.out.println("comparing c1 and c2: "+(c1==c2));



        System.out.println(pi + "\n" +c2.pi+"\n"+ c1.pi+"\n"+c1.radius);
        double d= areaOfCircle();
        System.out.println(d);
    }


    public boolean equals(Circle obj) {
        if (this.getClass()!=obj.getClass())return false;
        else if (this.radius!=obj.radius)return false;
        else return true;
    }
}
