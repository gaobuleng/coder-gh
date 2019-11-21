public class Fibonacci {
    public static void main(String[] args) {
        fibonacci(5);
        fibonacci(2);
        fibonacci(100);
    }

    public static void fibonacci(int n) {
        int a = 1;
        int b = 1;
        int c = 0;
        if (n == 1)
            System.out.print(a + " ");

        if (n == 2)
            //System.out.print(a + " ");
            System.out.print(b + " ");
        if (n > 2) {
            for (int i = 2; i < n; i++) {
                c = a + b;
                // System.out.print(c + " ");
                a = b;
                b = c;
            }
            System.out.print(c + " ");
        }
        System.out.println();
    }
}