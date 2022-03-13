package algorithm.baekjoon;

import java.io.*;
import java.util.*;
import static java.lang.Integer.*;

public class sol_1913{

    public static int n,k;
    public static int[] w, v;
    public static int[][] arr;
    public static int[][] dirs = {{1,0},{0,1},{-1,0},{0,-1}};
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

    public static void main(String[] args) throws IOException{
        StringTokenizer st;
        br= new BufferedReader(new InputStreamReader(System.in));
        bw= new BufferedWriter(new OutputStreamWriter(System.out));
        n = parseInt(br.readLine());
        k = parseInt(br.readLine());
        arr = new int[n][n];
        boolean check = false;
        Node node = new Node(0,0, 0, n*n);
        while(node.move()){
            arr[node.x][node.y]=node.value--;
        }
        if(k<=n*n) check =true;
        int x=0,y=0;
        for(int i=0; i<n;i++){
            for(int j=0; j<n;j++){
                sb.append(arr[i][j]).append(" ");
                if(check && arr[i][j]==k){
                    x=i+1;
                    y=j+1;
                }
            }
            sb.append("\n");
        }
        sb.append(x).append(" ").append(y).append("\n");
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

}