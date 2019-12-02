public class Test14 {
    public static void main(String[] args) {
        Str.print();
    }

}
class Str {

    static String str1 = "str1";
    static String str2 ;
    static {
        str2 = "str2";
    }
    static void print() {
        System.out.println("str1:"+str1+"str2:"+str2);
    }

}



