import java.util.*;

public class Day34{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split(",");
        StringBuilder ans = new StringBuilder();

        for(int i=0;i<s.length;i++){
            String[] temp = s[i].split(":");
           
            int len = temp[0].length();
            int[] pos = new int[temp[1].length()];
          
            
            for(int j=0;j<temp[1].length();j++){
                pos[j] = temp[1].charAt(j) - '0';
               
            }
            
            if(Arrays.binarySearch(pos,len) != -1){
                ans.append(temp[0].charAt(len -1));
                
            }
            else{
                Arrays.sort(pos);
                int max = 0;
                for(int j=0;j<pos.length;j++){
                    if(pos[i] > max && pos[i] < len){
                        max = pos[i];
                    }
                }
                 if(max > 0){
                    ans.append(temp[0].charAt(max -1));
                 }
                 else{
                     ans.append("X");
                 }
            }
            // System.out.println(Arrays.toString(pos));
        }
        
      
        System.out.println(ans);
    }
}
