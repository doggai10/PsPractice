import java.util.Arrays;
import java.util.Scanner;



public class shortestPath1 {
    public static final Scanner sc = new Scanner(System.in);
    public static int n,m,x,k, INF=(int)1e9;
    public static int[][] graph= new int[101][101];
    public static void main(String[] args) {
            n=sc.nextInt();
            m=sc.nextInt();
            for(int i=0; i<101;i++){
                Arrays.fill(graph[i],INF);
            }

            for(int i=0;i<=m;i++){
                graph[i][i]=0;
            }

            for(int i=0;i<m;i++){
                int a=sc.nextInt();
                int b=sc.nextInt();
                graph[a][b]=1;
                graph[b][a]=1;
            }

            x=sc.nextInt();
            k=sc.nextInt();


            for(int i=1; i<=m;i++){
                for(int j=1; j<=m;j++){
                    for(int k=1; k<=m;k++){
                        graph[j][k]= Math.min(graph[j][k],graph[j][i]+graph[i][k]);
                    }
                }
            }

            int answer = graph[1][k]+graph[k][x];
            if (answer >=INF){
                System.out.println(-1);
            }else{
                System.out.println(answer);
            }
    }
}
