//Summation Calculator
import java.util.*;

public class Madhu{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] s = sc.nextLine().split(" ");
        int l = Integer.parseInt(s[0]);
        int u = Integer.parseInt(s[1]);
        char o = s[2].charAt(0);
        int n = Integer.parseInt(s[3]);
        float ans = 0;
        
        for(int i = l; i<= u ;i++){
            switch(o){
                
                case '+' : ans = ans + (i + n); break;
                case '-' : ans = ans + (i - n); break;
                case '*' : ans = ans + (i * n); break;
                case '%' : ans = ans + (i % n); break;
                case '/' : ans = ans + Math.floorDiv(i,n); break;
            }    
        }
        System.out.println((int)ans);
    }

}
