import java.util.*;

public class Day26{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split(",");
 
        for(int i=0;i<s.length;i++){
            String[] a = s[i].split(":");
            String x = a[0];
            int num = Integer.parseInt(a[1]);
            if(sum(num)){
                System.out.println(x.substring(x.length() -1) + x.substring(0,x.length() -1));
            }
            else{
                System.out.println(x.substring(2)  + x.substring(0,2));
            }
        }
    }
    public static boolean sum(int n){
        int x=0;
        while(n>0){
            x += Math.pow(n%10,2);
            n/=10;
        }
        return x%2 == 0;
    }
}
