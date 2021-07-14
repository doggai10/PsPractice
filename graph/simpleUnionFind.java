package algorithm.graph;

import java.util.Scanner;

public class simpleUnionFind {

    public static final Scanner sc = new Scanner(System.in);
    public static int[] parent = new int[100001];
    public static int v,e;

    public static int findParent(int x){
        if ( x!= parent[x]){
            return findParent(parent[x]);
        }
        return x;
    }

    public static void unionParent(int a, int b){
        a= findParent(a);
        b= findParent(b);
        if(a<b){
            parent[b]=a;
        }else{
            parent[a]=b;
        }
    }

    public static void main(String[] args) {
        v=sc.nextInt();
        e=sc.nextInt();

        for(int i=1; i<=v;i++){
            parent[i]=i;
        }

        for(int i=0; i<e;i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            unionParent(a,b);
        }

        System.out.print("각 원소가 속한 집합: ");
        for(int i=1; i<=v; i++){
            System.out.print(findParent(i)+" ");
        }
        System.out.println();

        System.out.print("부모 테이블: ");
        for(int i=1; i<=v;i++){
            System.out.print(parent[i]+" ");
        }
        System.out.println();
    }

}
