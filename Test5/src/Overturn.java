import java.math.*;
public class Overturn {
    public static void main(String[] args) {
        //overturn(65535);

        BigInteger a = BigInteger.valueOf(1230);
        BigInteger b = BigInteger.valueOf(987654123);
        BigInteger c = BigInteger.valueOf(1000);
        negate(a);
        System.out.println(a + " ");
        negate(b);
        System.out.println(b + " ");
        negate(c);
        System.out.println(c + " ");
    }

   // public static void overturn(int i) {
     //   negate(i);

   // }
}