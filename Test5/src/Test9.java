public class Test9 {
    public static void main(String[] args) {
        Flow f = new Flow("str",26);
    }
}
class Flow{
    Flow(){
        //this("str",26);
        System.out.println("默认构造器");
    }
    Flow(String s,int i){
        this();
        System.out.println("s:"+s+" i:"+i);
    }
}
