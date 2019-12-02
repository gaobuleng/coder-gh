import java.util.Random;

/*练习17：创建一个类，他有一个接受一个String参数的构造器。
在构造阶段，打印该参数。创建一个该类的对象引用数组，
但是不实际去创建对象赋值给该数组。当运行程序时，
请注意来自对该构造器的调用中的初始化消息是否打印了出

通过创建对象赋值给引用数组，从而完成前一个练习。
 */
public class Test17 {
    public static void main(String[] args) {
        Random rand =new Random(47);
        Strpig[] pig = new Strpig[rand.nextInt(5)];
        for(int i=0;i<pig.length;i++){
            pig[i]=new Strpig("pig"+i);
        }
    }
}

class Strpig {
    Strpig(String s) {
        System.out.println(s);
    }
}
