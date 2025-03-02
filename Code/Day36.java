import java.util.*;
public class Day36{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        
        while(k -- >0){
            
            int n = sc.nextInt();
            n++;
            
            while(!IsPali(String.valueOf(n))){
                n++;
            }
            System.out.println(n);

        }
    }
    
    public static boolean IsPali(String n){

        StringBuilder rev = new StringBuilder(n).reverse();
        return n.equals(rev.toString());
    }
}
