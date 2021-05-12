import java.util.ArrayList;
import java.util.Scanner;

public class dfsTest {
    public static Scanner sc = new Scanner(System.in);
    public static int n,m;
    public static int[][] graph;
    public static boolean dfs(int x, int y){
        if(x<0 || x>=n || y<0 || y>=m){
            return false;
        }

        if(graph[x][y]==0){
            graph[x][y]=1;
            dfs(x+1,y);
            dfs(x,y+1);
            dfs(x-1,y);
            dfs(x,y-1);
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        n=sc.nextInt();
        m=sc.nextInt();
        sc.nextLine();
        graph= new int[n][m];
        for(int i=0;i<n;i++){
            String input =sc.nextLine();
            for(int j=0;j<m;j++){
                graph[i][j]=input.charAt(j)-'0';
            }
        }

        int count=0;
        for(int i=0; i<n;i++){
            for(int j=0; j<m;j++){
                if(dfs(i,j)){
                    count++;
                }
            }
        }
        System.out.println(count);


    }

}
