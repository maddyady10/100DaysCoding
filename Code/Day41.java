//Weight of a Hill Pattern 
import java.util.*;

public class Day41{
    public static void main(String[] args){
        
        Scanner sc  = new Scanner(System.in);
        int l = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int sum = 0 ; 
        
        for(int i = 0 ; i < l ; i++ ){
            
            int o = n + (k *i);
            int e = o - k;
            sum = sum +  (o * (i + 1) + e * i);
        }
        System.out.println(sum);
    }
}
