/*N级台阶，每次走一级或者两级  共有多少种方法*/
public class Step {
    public static void main(String[] args) {
        System.out.println(stepNum(100));
    }

    public static int stepNum(int n) {
        int sstep = 0, dstep = 0;
        for (int i = 0; i < n; i++) {
            sstep += 1;
        }
        for (int i = 0; i < n; i += 2) {
            dstep += 1;
        }
        return (sstep - dstep + 1);
    }
}
