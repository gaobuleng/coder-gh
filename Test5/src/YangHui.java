
public class YangHui {
    public static void main(String[] args) {
        numYang(10);
    }

    public static void numYang(int n) {
        int[][] a = new int[n][n];
        for (int i = 0; i < n; i++) {
            a[i][0] = 1;
            a[i][i] = 1;
        }
        if (n == 1) {
            System.out.print(a[0][0]);
        } else if (n == 2) {
            System.out.println(" " + a[0][0] + " ");
            System.out.print(a[1][0] + " " + a[1][1]);
        } else {
            for (int k = n; k > 1; k--) {
                System.out.print(" ");
            }
            System.out.println(a[0][0]);
            for (int i = 1; i < n; i++) {
                for (int k = n; k > i + 1; k--) {
                    System.out.print(" ");
                }
                System.out.print(a[i][0] + " ");
                for (int j = 1; j < i; j++) {
                    a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
                    System.out.print(a[i][j] + " ");
                }
                System.out.print(a[i][i] + " ");
                System.out.println();
            }
        }

    }
}
