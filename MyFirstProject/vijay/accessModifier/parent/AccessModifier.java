package parent;

public class AccessModifier {
    public int a=10;
    private int b=20;
    protected int c=30;
    int d=40; //default

    public static void main(String[] args) {
        AccessModifier accessModifier=new AccessModifier();
        System.out.println(accessModifier.a);
        System.out.println(accessModifier.b);
        System.out.println(accessModifier.c);
        System.out.println(accessModifier.d);
    }
}
