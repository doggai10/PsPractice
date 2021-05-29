import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;

class Node implements Comparable<Node>{

    private int index;
    private int distance;

    public Node(int index, int distance){
        this.index=index;
        this.distance=distance;
    }

    public int getIndex(){
        return this.index;
    }

    public int getDistance(){
        return this.distance;
    }

    @Override
    public int compareTo(Node other) {
        if(this.distance < other.distance){
            return -1;
        }
        return 1;
    }
}


public class improvedDijkstra {

    public static Scanner sc = new Scanner(System.in);
    public static final int INF = (int)1e9;
    public static int n,m,start;
    public static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
    public static int[] distance = new int[100001];

    public static void dijkstra(int start){
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(start,0));
        distance[start]=0;
        while(!pq.isEmpty()){
            Node node = pq.poll();
            int dist =node.getDistance();
            int now =node.getIndex();
            if(distance[now]<dist){
                continue;
            }
            for(int i=0;i<graph.get(now).size();i++){
                int cost = distance[now]+graph.get(now).get(i).getDistance();
                if(cost < distance[graph.get(now).get(i).getIndex()]){
                    distance[graph.get(now).get(i).getIndex()]=cost;
                    pq.offer(new Node(graph.get(now).get(i).getIndex(),graph.get(now).get(i).getDistance()));
                }
            }
        }
    }
    public static void main(String[] args) {
        n = sc.nextInt();
        m = sc.nextInt();
        start = sc.nextInt();


        for (int i = 0; i <= n; i++) {
            graph.add(new ArrayList<Node>());
        }

        for (int i = 0; i < m; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            graph.get(a).add(new Node(b, c));
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
