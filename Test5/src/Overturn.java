public class Overturn {
    public static void main(String[] args) {
        overturn(65535);
        overturn(21030);
        overturn(205);
        overturn(56);
        overturn(2);
    }

    public static void overturn(int i) {
        int w, q, b, s, g;
        if (i / 10000 >= 1 && i/100000 <1) {
            w = i / 10000;
            q = (i / 1000) % 10;
            b = (i / 100) % 10;
            s = (i / 10) % 10;
            g = i % 10;
            System.out.println(g + "" + s + "" + b + "" + q + "" + w);
        } else if (i / 1000 >= 1) {
            q = (i / 1000) % 10;
            b = (i / 100) % 10;
            s = (i / 10) % 10;
            g = i % 10;
            System.out.println(g + "" + s + "" + b + "" + q);
        } else if (i / 100 >= 1) {
            b = (i / 100) % 10;
            s = (i / 10) % 10;
            g = i % 10;
            System.out.println(g + "" + s + "" + b);
        } else if (i / 10 >= 1) {
            q = (i / 1000) % 10;
            b = (i / 100) % 10;
            s = (i / 10) % 10;
            g = i % 10;
            System.out.println(g + "" + s);
        } else {
            g=i;
            System.out.println(g+"");
        }
    }
}