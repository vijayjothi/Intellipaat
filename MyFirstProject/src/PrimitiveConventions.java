public class PrimitiveConventions {
    public static void main(String[] args) {
        byte byteVar=20;
        System.out.println(byteVar);

        short shortVar=50;
        System.out.println(shortVar);

        int intVar=100;
        System.out.println(intVar);

        long longVar=23876237868237L;
        System.out.println(longVar);

        float floatVar=50.546f;
        System.out.println(floatVar);

        double doubleVar=6375263.32176d;
        System.out.println(doubleVar);

        boolean booleanVar=true;
        System.out.println(booleanVar);

        char charVar=(char) 97;
        System.out.println(charVar);

        char character='c';
        System.out.println(character);

        widening();
        narrowing();
    }

    public static void widening(){
        float f=67.77f;
        double doubleVariable=(double) f;
        System.out.println(f + "\n"+ doubleVariable);
    }

    public static void narrowing(){
        long l=60000000000000l;
        int i=(int) l;
        System.out.println(l+"\n"+i);
    }
}
