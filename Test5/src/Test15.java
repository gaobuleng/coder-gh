public class Test15 {
    public static void main(String[] args) {
        new Strcat();
        System.out.println("shuchu :");
        new Strcat("str1 && str2 :");
    }
}
class Strcat{
    String str1;
    String str2;
    {
        str1="cat1";
        str2="cat2";
    }
    Strcat(){
        System.out.println(str1+" "+str2);
    }
    Strcat(String s){
        System.out.println(s+str1+" "+str2);
    }
}
