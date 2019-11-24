public class Overturn {
    public static void main(String[] args) {
        reverse(10230);
    }
    public static void reverse(int x) {
        int ans = 0;
        while (x != 0) {
            int pop = x % 10;
            if (ans > Integer.MAX_VALUE / 10 || (ans == Integer.MAX_VALUE / 10 && pop > 7))
                System.out.println(0);
            if (ans < Integer.MIN_VALUE / 10 || (ans == Integer.MIN_VALUE / 10 && pop < -8))
                System.out.println(0);
            ans = ans * 10 + pop;
            x /= 10;
        }
        System.out.println(ans);
    }
}


