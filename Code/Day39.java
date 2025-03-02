import java.util.*;

public class Day39{
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        
        Stack<Character> st = new Stack<>();
        int c = 0;
        
        for(int i=0;i<s.length();i++){
       
            char x = s.charAt(i);
            
            if(x == '(' || x == '{' || x =='['){
                st.push(x);
                c++;
            }
            else if(st.peek() == '(' && x == ')' && st.size() !=0){
                st.pop();
                c++;
            }
            else if(st.peek() == '[' && x == ']' && st.size() !=0){
                st.pop();
                c++;
            }
            else if(st.peek() == '{' && x == '}' && st.size() !=0){
                st.pop();
                c++;
            }
            else{
                c++;
                System.out.println(c);
                return;
            }
        }

        if(st.size() == 0) System.out.println("0");
        else System.out.println(c + st.size());
        
    }
}
