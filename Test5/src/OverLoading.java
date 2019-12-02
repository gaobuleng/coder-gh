class Tree{
    int height;
    Tree(){
        System.out.println("planting a seeding");
        height=0;
    }
    Tree(int initialheight){
        height=initialheight;
        System.out.println("creating new tree is "+height+"feet tall");
    }
    void info(){
        System.out.println("Tree is "+height+" feet tall");
    }
    void info(String s){
        System.out.println(s+": Tree is "+height+"feet tall");
    }
}
public class OverLoading {
    public static void main(String[] args) {
        for(int i=2;i<5;i++){
            Tree t =new Tree(i);
            t.info();
            t.info("overloaded method");
        }
        new Tree();
    }
}
