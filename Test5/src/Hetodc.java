public class Hetodc {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(hexToDec(s));
    }

    public static int hexToDec(String s) {
        int len = s.length();
        int ans = 0;
        int ic = 0;

        for (int i = 0; i < len; i++) {
            char c = s.charAt(i);
            ic = (char) c;
            if (ans > Integer.MAX_VALUE / 10 || ans == Integer.MAX_VALUE / 10 && ic > 7) {
                return 0;
            }
            if (ans < Integer.MIN_VALUE / 10 || ans == Integer.MIN_VALUE / 10 && ic < -8) {
                return 0;
            }
            // 取出每一位的十进制数的值
            ans = ans * 16 + value(ic);
        }
        return ans;
    }

    public static int value(int ia) {
        if (ia >= 97 && ia <= 102) {                   //a-f
            return (ia - 87);
        } else if (ia >= 65 && ia <= 70) {
            return (ia - 55);
        } else if (ia >= 48 && ia <= 57) {
            return (ia - 48);
        } else {
            System.out.println("error");
            return Integer.MAX_VALUE + 1;
        }
    }
}
