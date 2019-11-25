
//import java.lang.String;

public class Atoi {
    public static void main(String[] args) {
        String s = "123";
        System.out.println(s);
        System.out.println(atoi(s));
    }

    public static int atoi(String s) {
        int len = s.length();
        long ans = 0;
        char c;
        for (int i = 0; i < len; i++) {
            c = s.charAt(i);
            int ic = (int) c;
            if (ic / 100 > 0) {
                ans = ans * 1000 + ic;
            } else if (ic / 10 > 0) {
                ans = ans * 100 + ic;
            } else {
                ans = ans * 10 + ic;
            }

        }
        if (ans > Integer.MAX_VALUE || ans<Integer.MIN_VALUE) {
            return 0;
        }
        return (int)ans;
    }

}
