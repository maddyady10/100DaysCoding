import java.util.*;

public class Day32{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        
        while(k>0){
            int n = sc.nextInt();
            if(n<=0){
                 System.out.println("not ugly");
            }
            else{
                  System.out.println(Ugly(n));
            }
            k--;
        }
    }
    public static String Ugly(int n){
        
        
        while(n%2 ==0){
            n/=2;
        }
        while(n%3 ==0){
            n/=3;
        }
        while(n%5 ==0){
            n/=5;
        }
        return n==1? "ugly" : "not ugly";
      
    }
}
