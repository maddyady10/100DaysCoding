import java.util.*;
public class Day31{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();
        while(k>0){
            ArrayList<Integer> li = new ArrayList<>();
            int n = sc.nextInt();
            
            for(int i = 2; i < n ;i ++){
                    if(isPrime(i)){
                        li.add(i);
                    }}
            
            Set<Integer> s = new HashSet<>();
            for(int i=0;i<li.size();i++){
                for(int j=0;j<li.size();j++){
                    s.add(li.get(i) * li.get(j));
                }
            }
            for( int i : s){
                if(i<=n){
             System.out.print(i + " ");}
            }

            k--;
            System.out.println();
        }
    }
    public static boolean isPrime(int x){
        for(int i = 2 ; i*i<=x;i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }
}
