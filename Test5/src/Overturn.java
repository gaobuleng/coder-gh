public class Overturn {
    public static void main(String[] args) {
        reverse(12360);
    }
    public static void reverse(int x){
        long ans=0;
        while(x!=0){
            ans =  ans*10 + x%10;
            if(ans>Integer.MAX_VALUE || ans<Integer.MIN_VALUE ){
                System.out.println(0);
            }
            x/=10;
        }
        System.out.println((int)ans);
    }
}


