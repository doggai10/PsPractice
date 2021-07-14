package algorithm.graph;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class graph3 {

    public static int v;
    public static int[] times =new int[501];
    public static int[] degree= new int[501];
    public static ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
    public static final Scanner sc = new Scanner(System.in);


    public static void topologySort(){
        int[] result = new int[501];
        for(int i=1; i<=v;i++){
            result[i]=times[i];
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int i=1; i<=v;i++){
            if(degree[i]==0){
                queue.offer(i);
            }
        }
        while(!queue.isEmpty()){
            int now=queue.poll();
            for(int i=0; i<graph.get(now).size();i++){
                result[graph.get(now).get(i)]= Math.max(times[graph.get(now).get(i)]+result[now], times[graph.get(now).get(i)]);
                degree[graph.get(now).get(i)]-=1;
                if(degree[graph.get(now).get(i)]==0){
                    queue.offer(graph.get(now).get(i));
                }
            }
        }
        for (int i = 1; i <= v; i++) {
            System.out.println(result[i]);
        }
    }

    public static void main(String[] args) {
        v=sc.nextInt();

        for(int i=0;i<=v;i++){
            graph.add(new ArrayList<Integer>());
        }


        for(int i=1; i<=v;i++){
            int x = sc.nextInt();
            times[i]=x;
            while(true){
                x=sc.nextInt();
                if(x==-1){
                    break;
                }
                degree[i]+=1;
                graph.get(x).add(i);
            }
        }

        topologySort();
    }

}
