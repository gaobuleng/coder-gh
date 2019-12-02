public class Test19 {
    static void f(Object... args) {
        for (Object cr : args) {
            System.out.print(cr + " ");
        }
        System.out.println();
    }

    public static void main(String... args) {
        f(new String[]{"gh", "aaks"});
        f("gh", "gy");
        f(new Integer(1),2,3);
        f(new Float(11.11),new Double(22.22));
    }
}
