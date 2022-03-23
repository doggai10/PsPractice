package algorithm.baekjoon;

import java.io.*;
import java.util.*;
import static java.lang.Integer.*;

public class sol_3663 {

    public static BufferedReader br;
    public static BufferedWriter bw;
    public static StringBuilder sb;
    public static StringTokenizer st;

    public static void main(String[] args) throws IOException{
        br= new BufferedReader(new InputStreamReader(System.in));
        bw= new BufferedWriter(new OutputStreamWriter(System.out));
        sb = new StringBuilder();
        int n = parseInt(br.readLine());
        for(int test=0 ;test<n;test++){
            String name = br.readLine();
            int answer = 0;
            int len = name.length();
            int minCursor = len - 1;
            for (int i = 0; i < len; i++) {

                char c = name.charAt(i);
                int move = Math.min(c-'A', 'Z'-c+1);
                answer += move;


                int nextIndex = i + 1;
                while (nextIndex < len && name.charAt(nextIndex) == 'A')
                    nextIndex++;

                minCursor = Math.min(minCursor, Math.min(2*i + len-nextIndex, 2*(len-nextIndex)+i ));
            }
            answer += minCursor;
            sb.append(answer).append("\n");
        }
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

}