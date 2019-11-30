/*N级台阶，每次走一级或者两级
            共有多少种方法*/
public class Step {
    public static void main(String[] args) {
        System.out.println(stepNum(20));
    }

    public static int stepNum(int n) {
         int a = 1,b=1,c=0;
         if(n==0){
             return a;
         } else if(n==1){
            return b;
         }else{
            for(int i=2;i<=n;i++){
                c=a+b;
                a=b;
                b=c;
            }
            return c;
        }

    }
}


