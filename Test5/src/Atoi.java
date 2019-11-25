
import java.lang.String;
public class Atoi {
    public static void main(String[] args) {
        String s = "ABC";
        System.out.println(s);
        System.out.println(atoi(s));
    }
    public static int atoi(String s){
        int len=s.length(),ans=0;
        char c;
        for(int i=0;i<len;i++){
            c = s.charAt(i);
            System.out.println(c);
            ans = ans*10+(int)c;
        }
        return ans;
    }

}
