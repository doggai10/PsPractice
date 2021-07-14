package algorithm.dfsbfs;

import java.util.*;

public class bfsTest {

    public static Scanner sc = new Scanner(System.in);
    public static int n,m;
    public static int[][] graph;
    public static boolean[][] visited;
    public static int[] dirX= {0, 1,-1, 0} ;
    public static int[] dirY= {1, 0, 0,-1};

    public static class Node{
        int x;
        int y;
        int depth;
    
        Node(int _x, int _y, int _depth){
            this.x=_x;
            this.y=_y;
            this.depth=_depth;
        }
    }
    public static void bfs(int x, int y){
        Queue<Node> queue = new LinkedList<>();
        queue.add(new Node(x,y,1));
        while(!queue.isEmpty()){
            Node node = queue.poll();
            int posX= node.x;
            int posY = node.y;
            int depth = node.depth;
            visited[posX][posY]=true;
            for(int i=0; i<4; i++){
                int nextX = posX+dirX[i];
                int nextY = posY+dirY[i];

                if(nextX < 0 || nextX >= n ||nextY < 0 || nextY >= m ){
                    continue;
                }

                if(graph[nextX][nextY]==0){
                    continue;
                }

                if(graph[nextX][nextY]==1 && !visited[nextX][nextY]){
                    queue.add(new Node(nextX,nextY,depth+1));
                }

            }
            if(visited[n-1][m-1]){
                System.out.println(depth);
                break;
            }

//            if(posY-1>=0 && posY-1<m &&  graph[posX][posY-1]==1 && !visited[posX][posY-1]){
//                queue.add(new Node(posX,posY-1, depth+1));
//            }
//            if(posY+1>=0 && posY+1<m && graph[posX][posY+1]==1 && !visited[posX][posY+1]){
//                queue.add(new Node(posX,posY+1, depth+1));
//            }
//            if(posX-1>=0 && posX-1<n && graph[posX-1][posY]==1 && !visited[posX-1][posY]){
//                queue.add(new Node(posX-1,posY, depth+1));
//            }
//            if( posX+1>=0 && posX+1<n && graph[posX+1][posY]==1 && !visited[posX+1][posY]){
//                queue.add(new Node(posX+1,posY, depth+1));
//            }


        }


    }

    public static void main(String[] args) {
        n=sc.nextInt();
        m=sc.nextInt();
        sc.nextLine();
        graph= new int[n][m];
        visited= new boolean[n][m];
        for(int i=0;i<n;i++){
            String input =sc.nextLine();
            for(int j=0;j<m;j++){
                graph[i][j]=input.charAt(j)-'0';
                visited[i][j]=false;
            }
        }
        visited[0][0]=true;
        bfs(0,0);


    }
}
