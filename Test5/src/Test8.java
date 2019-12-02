public class Test8 {
    public static void main(String[] args) {
        Appler apple = new Appler();
        apple.getApple();
    }
}
class Appler {
    public  void getApple() {
        System.out.print("未使用this调用：");
        createApple();
        System.out.print("使用this调用：");
        this.createApple();
    }

    public  void createApple() {
        System.out.println("已创建好……");
    }
}