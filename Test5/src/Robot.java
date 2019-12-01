public class Robot {
    public static void main(String[] args) {
        System.out.println(numMove(5, 4));
    }

    public static int numMove(int m, int n) {
        if (m + n > 12) {
            System.out.println("ERROR");
            return 0;
        } else {
            int[][] c = new int[m][n];
            for (int j = 1; j < n; j++) {
                c[1][j] = j+1;
            }
            for (int j = 0; j < n; j++) {
                c[0][j] = 1;
            }
            for (int i = 0; i <m; i++) {
                c[i][0] = 1;
            }
            if (m == 1 || n == 1) {
                return 1;
            } else if (m == 2) {
                return n;
            } else {
                for (int i = 2; i < m; i++) {
                    for (int j = 1; j < n; j++) {
                        c[i][j] = c[i][j - 1] + c[i - 1][j];
                    }
                }
                return c[m-1][n-1];
            }

        }
    }
}
