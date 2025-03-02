import java.util.*;

public class Day27{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = m + 1;
        int[][] a = new int[m][n];
        for(int i=0;i<m;i++){
            for(int j = 0; j<n ; j++){
                a[i][j] = sc.nextInt();
            }
        }

        int ans = Integer.MAX_VALUE;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(j+2 <n && a[i][j] ==a[i][j+1] && a[i][j] == a[i][j+2]){
                    ans = Math.min(ans,a[i][j]);
                }
                if(i+2<m && a[i][j] == a[i+1][j] &&  a[i][j] == a[i+2][j]){
                    ans = Math.min(ans,a[i][j]);
                }
                if(i+2<m && j+2<n && a[i][j]== a[i+1][j+1] && a[i][j] == a[i+2][j+2]){
                    ans = Math.min(ans,a[i][j]);
                }
                if(i+2<m && j-2 >=0 && a[i][j] == a[i+1][j-1] && a[i][j] == a[i+2][j-2]){
                    ans = Math.min(ans,a[i][j]);
                }
            }
        }
        System.out.println(ans);

    }
}
