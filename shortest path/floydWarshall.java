import java.util.Arrays;
import java.util.Scanner;

public class floydWarshall {

    public static final Scanner sc = new Scanner(System.in);
    public static final int INF = (int) 1e9;
    public static int[][] graph = new int[501][501];
    public static int n,m;

    public static void main(String[] args) {
        n=sc.nextInt();
        m=sc.nextInt();

        for(int i=0; i<501;i++){
            Arrays.fill(graph[i],INF);
        }

        for(int i=0;i<501;i++){
            graph[i][i]=0;
        }

        for(int i=0; i<m;i++){
            int a= sc.nextInt();
            int b= sc.nextInt();
            int c= sc.nextInt();
            graph[a][b]=c;
        }

        for(int i=1; i<=n;i++){
            for(int j=1; j<=n;j++){
                for(int k=1; k<=n;k++){
                    graph[j][k]=Math.min(graph[j][k], graph[j][i]+graph[i][k]);
                }
            }
        }

        for(int i=1; i<=n;i++){
            for(int j=1; j<=n;j++){
                if(graph[i][j]==INF){
                    System.out.print("INF ");
                }else{
                    System.out.print(graph[i][j]+" ");
                }
            }
            System.out.println();
        }



    }

}
