
//import java.lang.String;

public class Atoi {
    public static void main(String[] args) {
        String s = "ABCdfgh";
        System.out.println(s);
        System.out.println(atoi(s));
    }

    public static int atoi(String s) {
        int len = s.length(), ans = 0;
        char c;
        for (int i = 0; i < len; i++) {
            c = s.charAt(i);
            int ic = (int) c;
            if (ans > Integer.MAX_VALUE / 10 || ans == Integer.MAX_VALUE / 10 && ic > 7) {
                return 0;
            }
            ans = ans * 10 + ic;
        }
        return ans;
    }

}
