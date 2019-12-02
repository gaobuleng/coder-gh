class A{}
public class P101 {
    static void prrObject(Object[] obj){
        for(Object oo:obj){
            System.out.print(oo+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        prrObject(new Object[]{"asd","ghj","huj"});
        prrObject(new Object[]{new Integer(1),new Float(3.14),new Double(25.5)});
        prrObject(new Object[]{new A(),new A(),new A()});
        Other.main(new String[]{"figger","cat","tigger"});
    }
}
class Other{
    public static void main(String[] args) {
        for(String s:args)
            System.out.println(s);
    }
}
