package parent;

public class AccessModifierEg2 {
    public static void main(String[] args) {
        AccessModifier accessModifier=new AccessModifier();
        System.out.println(accessModifier.a);
       // System.out.println(accessModifier.b); private wont work
        System.out.println(accessModifier.c);
        System.out.println(accessModifier.d);
    }
}
