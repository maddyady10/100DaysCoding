import java.util.*;

public class Day35{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] m = new int[r][c];
        boolean[][] b = new boolean[r][c];
    
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                m[i][j] = sc.nextInt();
                b[i][j] = divide(m[i][j]);
            }
        }

        for(int i=0;i<=r-2;i++){
            for(int j=0;j<=c-2;j++){
                if(b[i][j] == true && b[i+1][j] == true && b[i][j+1] == true && b[i+1][j+1] == true ){
                    System.out.println(m[i][j] + " "+ m[i][j+1]);
                    System.out.println(m[i+1][j] + " "+ m[i+1][j+1]);
                }
            }
        }

    }
    public static boolean divide(int n){
        if (n == 0 ) return false;
        int x = n;
        int sum = 0;
        while(n>0){
            sum += n%10;
            n/=10;
        }
        return x % sum == 0;
        
    }
}
