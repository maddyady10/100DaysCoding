import java.util.*;
public class Day28{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int a[] = new int[10];
        StringBuilder ans = new StringBuilder();
        
        for(int i = 0;i<s.length();i++){
            if(Num(s.charAt(i))){
                int x = s.charAt(i) - '0';
                a[x] = 1;
            }
        }
        for(int i = 2; i<=8 ;i+=2){
            if(a[i] == 1){
                ans.append(i);
                a[i]--;
                break;
            }
        }
        
        if(ans.length() >0){
            for(int i=0;i<10;i++){
                if(a[i] == 1){
                    ans.append(i);
                }
            }
        }
        else{
            ans.append("1-");
        }
        System.out.println(ans.reverse());
    }

    public static Boolean Num(char x){
        if (x == '1' ||x == '2' ||x == '3' ||x == '4' || x == '5' ||x == '6' ||x == '7' ||
            x == '8' || x== '9' || x == '0'){
                return true;
            }
            return false;
    }
}
