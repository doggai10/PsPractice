package algorithm.dfsbfs;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node1 {

    private int x;
    private int y;

    public Node1(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}

public class bfsTest1 {

    public static Scanner sc = new Scanner(System.in);
    public static int n, m;
    public static int[][] graph = new int[201][201];

    public static int dirX[] = {-1, 1, 0, 0};
    public static int dirY[] = {0, 0, -1, 1};

    public static int bfs(int x, int y) {

        Queue<Node1> queue = new LinkedList<>();
        queue.add(new Node1(x, y));
        while (!queue.isEmpty()) {
            Node1 node = queue.poll();
            int posX = node.getX();
            int posY = node.getY();
            for (int i = 0; i < 4; i++) {
                int nextX = posX + dirX[i];
                int nextY = posY + dirY[i];

                if (nextX < 0 || nextX >= n || nextY < 0 || nextY >= m) {
                    continue;
                }

                if (graph[nextX][nextY] == 0) {
                    continue;
                }

                if (graph[nextX][nextY] == 1) {
                    graph[nextX][nextY] = graph[posX][posY] + 1;
                    queue.add(new Node1(nextX, nextY));
                }

            }
        }

        return graph[n-1][m-1];
    }
    public static void main(String[] args) {
        n=sc.nextInt();
        m=sc.nextInt();
        sc.nextLine();
        for(int i=0;i<n;i++){
            String input =sc.nextLine();
            for(int j=0;j<m;j++){
                graph[i][j]=input.charAt(j)-'0';
            }
        }
        System.out.println(bfs(0,0));

    }
}
