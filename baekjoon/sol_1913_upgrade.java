package algorithm.baekjoon;

import java.io.*;
import java.util.*;

import static java.lang.Integer.parseInt;

public class sol_1913_upgrade {

    public static int n,k;
    public static int[] w, v;
    public static int[][] arr;
    public static int[][] dirs = {{0,1},{1,0},{0,-1},{-1,0}};
    public static BufferedReader br;
    public static BufferedWriter bw;
    public static StringBuilder sb = new StringBuilder();

    static class  Node{
        int x;
        int y;
        int dir;
        int value;

        public Node(int x, int y, int dir, int value) {
            this.x = x;
            this.y = y;
            this.dir = dir;
            this.value= value;
        }

        public boolean move(){
            if(arr[this.x][this.y]==0) return true;
            int nextX=0, nextY=0;
            int tempDir =0;
            for(int i=0; i<4;i++){
                tempDir= (dir+i) %4;
                nextX = x +dirs[tempDir][0];
                nextY = y +dirs[tempDir][1];
                if(nextX <0 || nextY <0 || nextX >=n || nextY >= n) continue;
                if(arr[nextX][nextY]!=0)continue;
                break;
            }
            if(arr[nextX][nextY]!=0) return false;
            this.x = nextX;
            this.y= nextY;
            this.dir=tempDir;
            return true;

        }
    }

    public static void main(String[] args) throws IOException {
        StringTokenizer st;
        br= new BufferedReader(new InputStreamReader(System.in));
        bw= new BufferedWriter(new OutputStreamWriter(System.out));
        n = parseInt(br.readLine());
        k = parseInt(br.readLine());
        arr = new int[n][n];
        Queue<Node> que = new LinkedList<>();
        que.add(new Node(0,0,0,1));
        que.add(new Node(0,n-1,1,1));
        que.add(new Node(n-1,n-1,2,1));
        que.add(new Node(n-1,0,3,1));
        while(!que.isEmpty()){
            Node check = que. poll();
            if(check.move()){
                arr[check.x][check.y]=check.value;
                que.add(new Node(check.x, check.y, check.dir, check.value+1));
            }
        }
        if(k==0){
            for(int i=0; i<n;i++){
                for(int j=0; j<n;j++){
                    sb.append(arr[i][j]).append(" ");
                }
                sb.append("\n");
            }
        }else{
            for(int j=0; j<n;j++){
                for(int i=0; i<n;i++){
                    sb.append(arr[i][j]).append(" ");
                }
                sb.append("\n");
            }
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}
