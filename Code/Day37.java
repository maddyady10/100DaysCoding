import java.util.*;
public class Day37{
    public static void main(String[] args){
        Scanner sc  = new Scanner(System.in);
        String s = sc.next();
        
        if(s.length() == 1){
            System.out.println("-1");
            return;
        }
        int fl = 0;
        
        int[] arr = new int[s.length()];
        for(int i=0;i<s.length();i++){
            arr[i] = s.charAt(i) - '0';
        }
        
        TreeSet<Integer> ans = new TreeSet<>();
        for(int i=0;i<9;i++){
            int x = i * (i+1); 
            if(s.contains(String.valueOf(x))){

                 System.out.print(x + " ");
                 fl = 1;
            }
            
        }
     
        if (fl == 0){
             System.out.print("-1");
        }

    }
}
