public class MultipleMain {
    public static void main(String[] args) {
        System.out.println("hi");
        main(1);
        main("hello");
    }

    public static void main(int i) {
        System.out.println("hello");
    }

    public static void main(String s) {
        System.out.println("welcome");
    }
}
