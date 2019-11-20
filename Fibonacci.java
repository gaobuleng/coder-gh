public class Fibonacci {
    public static void main(String[] args) {
        fibonacci(5);
        fibonacci(2);
        fibonacci(15);
    }

    public static void fibonacci(int n) {
        int a = 1;
        int b = 1;
        //if(n=1)

        if (n > 1)
            System.out.print(a + " ");
        System.out.print(b + " ");
        if (n > 2) {
            for (int i = 2; i < n; i++) {
                int c = a + b;
                System.out.print(c + " ");
                a = b;
                b = c;
            }

        }
        System.out.println();
    }
}
