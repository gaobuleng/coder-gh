public class OverloadingOrder {
    static void f(String s, int i) {
        System.out.println("string  is : " + s + ", int is : " + i);
    }

    static void f(int i, String s) {
        System.out.println(" int is : " + i + ",string  is : " + s);
    }

    public static void main(String[] args) {
        f("string first", 11);
        f(99, "int first");
    }
}
