/*N级台阶，每次走一级或者两级
            共有多少种方法*/
public class Step {
    public static void main(String[] args) {
        System.out.println(stepNum(10));
    }

    public static int stepNum(int n) {
        long numstep = 0;
        if (n % 2 == 0) {
            for (int i = n / 2 + 1; i < n; ++i) {
                if (numstep > Integer.MAX_VALUE || numstep < Integer.MIN_VALUE) {
                    return 0;
                }
                numstep += numMid(i, n);
            }
            return (int) (numstep + 2);
        } else {
            for (int i = n / 2 + 2; i < n; ++i) {
                if (numstep > Integer.MAX_VALUE || numstep < Integer.MIN_VALUE) {
                    return 0;
                }
                numstep += numMid(i, n);
            }
            return (int) (numstep + n / 2 + 2);
        }

    }

    static int numMid(int i, int n) {
        int res = 0;
        res = n % i;
        return ((factorial(i)) / (factorial(res)) / factorial(i - res));

    }

    static int factorial(int ii) {
        int ans = 1;
        for (int i = ii; i >= 1; --i) {
            ans = ans * i;
        }
        return ans;
    }

}

