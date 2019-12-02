public class Test10 {
    public static void main(String[] args) {
        Final fi = new Final();
        System.gc();
        System.runFinalization();
    }
}

class Final {
    protected void finallize() {
        System.out.println("error: check out");
    }
}





