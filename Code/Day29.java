import java.util.*;

public class Day29{
public static void main(String args[]){
    Scanner sc  =new Scanner(System.in);
    String in = sc.next();

    int fi = in.indexOf("5");
    int ei = in.indexOf("8");

    String ans = in.replace(",","").substring(fi/2 ,ei/2 + 1 );
    String s = (in.substring(0,fi) + in.substring(ei+1)).replace(",","");
    int ans2 =0;

    for( int i = 0 ; i < s.length() ; i++){
        ans2 += s.charAt(i) - '0';
    }

    System.out.println(Integer.parseInt(ans) + ans2);
}
}
