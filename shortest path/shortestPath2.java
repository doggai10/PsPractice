import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

class Node implements Comparable<Node> {
    private int index;
    private int distance;

    public Node(int index, int distance) {
        this.index = index;
        this.distance = distance;
    }

    public int getIndex() {
        return index;
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public int compareTo(Node other) {
        if(this.distance < other.distance){
            return -1;
        }
        return 1;
    }
}


public class shortestPath2 {


    public static final Scanner sc = new Scanner(System.in);
    public static int n,m,c, INF=(int)1e9;
    public static ArrayList<ArrayList<Node>> graph = new ArrayList<ArrayList<Node>>();
    public static int[] distance;

    public static void dijkstra(int start){
        PriorityQueue<Node> pq = new PriorityQueue<>();
        pq.offer(new Node(start, 0));
        distance[start]=0;
        while(!pq.isEmpty()){
            Node node = pq.poll();
            int now = node.getIndex();
            int dist = node.getDistance();
            if( distance[now]<dist){
                continue;
            }
            for(int i=0; i<graph.get(now).size();i++){
                int cost = graph.get(now).get(i).getDistance();
                if( cost < distance[graph.get(now).get(i).getIndex()]){
                    distance[graph.get(now).get(i).getIndex()]=cost;
                }
            }
        }
    }

    public static void main(String[] args) {
        n=sc.nextInt();
        m=sc.nextInt();
        c=sc.nextInt();
        for(int i=0;i<=n;i++){
            graph.add(new ArrayList<Node>());
        }
        distance = new int[n+1];
        for(int i=0; i<m;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int dist=sc.nextInt();
            graph.get(a).add(new Node(b,dist));
        }

        Arrays.fill(distance, INF);

        dijkstra(c);

        int count=0, max=0;
        for (int dist: distance) {
            if(dist !=INF){
                count++;
                max=Math.max(max, dist);
            }
        }

        System.out.println((count-1)+" "+max);
    }


}
