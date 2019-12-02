public class YangHui {
    public static void main(String[] args) {
       numYang(10);
    }

    public static void numYang(int n) {
        int[][] a = new int[n - 1][n];
        for (int i = 1; i < n; i++) {
            a[i - 1][0] = 1;
            a[i - 1][i] = 1;
        }
        if(n==1){
            System.out.print(a[0][0]+" "+a[0][1]);
        }else{
            System.out.println(a[0][0]+" "+a[0][1]);
            for (int i = 1; i < n - 1; i++) {
                System.out.print(a[i - 1][0] + " ");
                for (int j = 1; j <= i; j++) {
                    a[i][j] = a[i - 1][j - 1] + a[i - 1][j];
                    System.out.print(a[i][j] + " ");

                }
                System.out.print(a[i-1][i]+" ");
                System.out.println();
            }
        }

    }
}
