package child;

import parent.AccessModifier;

public class OtherPackage extends AccessModifier {
    public static void main(String[] args) {
        AccessModifier accessModifier=new AccessModifier();
        OtherPackage otherPackage=new OtherPackage();
        System.out.println(accessModifier.a);
        //System.out.println(accessModifier.b);
        //System.out.println(accessModifier.c);
       // System.out.println(accessModifier.d);
        System.out.println(otherPackage.c);//protected
        System.out.println(otherPackage.a);
    }
}
