
//import java.lang.String;

public class Atoi {
    public static void main(String[] args) {
        String s = "-123";
        System.out.println(s);
        System.out.println(atoi(s));
    }

    public static int atoi(String s) {

        if (s.charAt(0) == '+') {
            return atoiAns(1, s);
        } else if (s.charAt(0) == '-') {
            return (0 - atoiAns(1, s));
        } else {
            return atoiAns(0, s);
        }
    }

    public static int atoiAns(int j, String s) {
        int len = s.length();
        int ans = 0;
        char c;
        for (int i = j; i < len; i++) {
            c = s.charAt(i);
            int ic = ((int) c) - 48;

            if (ic < 0 || ic > 9) {
                System.out.println("error");
                break;
            }
            if (ans > Integer.MAX_VALUE / 10 || ans == Integer.MAX_VALUE / 10 && ic > 7) {
                return 0;
            }
            if (ans < Integer.MIN_VALUE / 10 || ans == Integer.MIN_VALUE / 10 && ic < -8) {
                return 0;
            }
            ans = ans * 10 + ic;
        }
        return ans;
    }

}
