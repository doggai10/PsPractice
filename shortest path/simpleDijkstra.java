import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

class simpleNode{
    private int index;
    private int distance;

    public simpleNode(int index, int distance){
        this.index=index;
        this.distance=distance;
    }

    public int getIndex(){
        return this.index;
    }

    public int getDistance(){
        return this.distance;
    }
}


public class simpleDijkstra {

    public static Scanner sc = new Scanner(System.in);
    public static final int INF = (int)1e9;
    public static int n,m,start;
    public static ArrayList<ArrayList<simpleNode>> graph = new ArrayList<ArrayList<simpleNode>>();
    public static boolean[] visited = new boolean[100001];
    public static int[] distance = new int[100001];


    public static int getSmallestNode(){
        int min_value=INF;
        int index=0;
        for(int i=1;i<=n;i++){
            if(distance[i]<min_value && !visited[i]){
                min_value=distance[i];
                index=i;
            }
        }
        return index;
    }

    public static void dijkstra(int start){
        distance[start] = 0;
        visited[start] = true;
        for(int j=0; j<graph.get(start).size();j++){
            distance[graph.get(start).get(j).getIndex()]=graph.get(start).get(j).getDistance();
        }

        for(int i=0; i<n-1; i++){
            int now = getSmallestNode();
            visited[now]=true;
            for (int j=0; j<graph.get(now).size();j++){
                int cost =distance[now]+ graph.get(now).get(j).getDistance();
                if(cost < distance[graph.get(now).get(j).getIndex()]){
                    distance[graph.get(now).get(j).getIndex()]=cost;
                }
            }
        }
    }

    public static void main(String[] args) {

        n = sc.nextInt();
        m = sc.nextInt();
        start = sc.nextInt();

        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<simpleNode>());
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph.get(a).add(new simpleNode(b, c));
        }

        Arrays.fill(distance, INF);
        dijkstra(start);


        for (int i = 1; i <= n; i++) {
            if (distance[i] == INF) {
                System.out.println("INFINITY");
            }
            else {
                System.out.println(distance[i]);
            }
        }

    }

}
