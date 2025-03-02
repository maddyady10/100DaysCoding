import java.util.*;

public class Madhu{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        String[] temp = sc.nextLine().split(":");
        
        String s = temp[0];
        int n = s.length();
        int a = Integer.parseInt(temp[1]) % n;
        int b = Integer.parseInt(temp[2]) % n;
        int c = Integer.parseInt(temp[3]);
        
        StringBuilder ans = new StringBuilder(s);
        
        // //num 1
        String x = s.substring(s.length() - a, s.length());
        ans.delete(s.length() - a , s.length());
        ans.insert(0,x);
        
        //num2
        String y =ans.substring(0,b);
        ans.delete(0,b);
        ans.insert(ans.length() ,y);
        
        //num3
        for(int i = 0;i<ans.length();i++){
            if(i % c != 0){
                System.out.print(ans.charAt(i));
            }
        }

    }
}
