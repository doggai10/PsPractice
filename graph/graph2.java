package algorithm.graph;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Edge implements Comparable<Edge>{
    private int distance;
    private int nodeA;
    private int nodeB;

    public Edge(int distance, int nodeA, int nodeB) {
        this.distance = distance;
        this.nodeA = nodeA;
        this.nodeB = nodeB;
    }

    public int getDistance() {
        return distance;
    }

    public int getNodeA() {
        return nodeA;
    }

    public int getNodeB() {
        return nodeB;
    }

    @Override
    public int compareTo(Edge other) {
        if(this.distance<other.distance){
            return -1;
        }
        return 1;
    }
}

public class graph2 {

    public static final Scanner sc =new Scanner(System.in);
    public static int n,m;
    public static int[] parent = new int[100001];
    public static ArrayList<Edge> edges = new ArrayList<>();
    public static int result=0;


    public static int findParent(int x){
        if(x==parent[x]){
            return x;
        }
        return parent[x]=findParent(parent[x]);
    }

    public static void unionParent(int a , int b){
        a=findParent(a);
        b=findParent(b);
        if(a<b){
            parent[b]=a;
        }else{
            parent[a]=b;
        }
    }

    public static void main(String[] args) {
        n=sc.nextInt();
        m=sc.nextInt();

        for(int i=1;i<=n;i++){
            parent[i]=i;
        }

        for(int i=0; i<m;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int cost = sc.nextInt();
            edges.add( new Edge(cost,a,b));
        }
        int last=0;
        Collections.sort(edges);
        for(int i=0; i<edges.size();i++){
            int distance = edges.get(i).getDistance();
            int nodeA = edges.get(i).getNodeA();
            int nodeB = edges.get(i).getNodeB();
            if(findParent(nodeA)!=findParent(nodeB)){
                unionParent(nodeA,nodeB);
                result+=distance;
                last=distance;
            }
        }
        System.out.println(result-last);
    }

}
