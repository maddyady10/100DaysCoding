import java.util.*;

public class Day33{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> li = new ArrayList<>();
        
        
        while(sc.hasNextInt()){
            li.add(sc.nextInt());
        }
        int n = li.size();
        int k  = li.get(n - 1);
        li.remove(n - 1);
        HashMap<Integer,Integer> map = new HashMap<>();
        
        if(li.size() < k){
            System.out.println(" ");
            return;
        }
        for(int i = 0;i < k ; i++){
            int x = li.get(i);
            map.put( x , map.getOrDefault(x , 0)  + 1);
        }

        System.out.print(map.size() + " ");
        
        for(int i = k;i < li.size() ;i++){
            int y = li.get(i-k);
            int x = li.get(i);
            map.put( x , map.getOrDefault(x , 0)  + 1);
            map.put( y , map.get(y)  - 1);
            if(map.get(y) == 0){
                map.remove(y);
            }
            System.out.print(map.size() + " ");
 
        }
    }
}
