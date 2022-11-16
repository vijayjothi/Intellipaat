public class Operators {
    public static void main(String[] args) {
        unaryOperator();
        conditionalOperator();
        shiftOperator();
    }
    public static void unaryOperator(){
        int a=10;
        System.out.println("A= "+a);
        System.out.println(a++);
        System.out.println("A= "+a);
        System.out.println(++a);
        System.out.println("A= "+a);
        System.out.println(a--);
        System.out.println("A= "+a);
        System.out.println(--a);
        System.out.println("A= "+a);

        //logical compliment operator
        boolean option=true;
        System.out.println(!option);

    }
    public static void conditionalOperator(){
        boolean trueVar=true;
        boolean falseVar=false;
        int i=10;
        System.out.println(trueVar&&trueVar);
        System.out.println(trueVar&&falseVar);
        System.out.println(trueVar||trueVar);
        System.out.println(falseVar||trueVar);

        System.out.println("ternary operator:"+ ((i==10) ?i : 0));
        System.out.println("ternary operator:"+ ((i<10) ?i : 0));

    }
    public static void shiftOperator(){
        byte i=31;
        //n<<size = n(2^size)
        System.out.println("Left shift: "+(i<<2));
        //n>>size = n/(2^size)
        System.out.println("Right shift: "+(i>>2));
    }
}
