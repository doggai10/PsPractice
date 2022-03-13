package algorithm.baekjoon;

import java.io.*;
import java.util.*;
import static java.lang.Integer.*;

public class sol_2116 {

    public static BufferedReader br;
    public static BufferedWriter bw;
    public static StringBuilder sb;
    public static StringTokenizer st;
    public static int n,res;
    public static int [][] dice = new int [100005][7];
    public static int [] reverse = new int[7];

    public static void main(String[] args) throws IOException{
        br= new BufferedReader(new InputStreamReader(System.in));
        bw= new BufferedWriter(new OutputStreamWriter(System.out));
        sb = new StringBuilder();
        input();
        makeMax();
        sb.append(res);
        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }

    public static void input() throws IOException {
        n = parseInt(br.readLine());
        for(int i=1; i<=n;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=1; j<=6;j++){
                dice[i][j]=parseInt(st.nextToken());
            }
        }
        reverse[1]=6;
        reverse[2]=4;
        reverse[3]=5;
        reverse[4]=2;
        reverse[5]=3;
        reverse[6]=1;
    }

    public static void makeMax(){
        for(int i=1; i<=6;i++){
            int temp=0;
            int nowMax=0, nowTop=dice[1][i], nowBottom=dice[1][reverse[i]];
            for(int j=1; j<=6;j++){
                if(j != nowTop && j!=nowBottom){
                    nowMax=Math.max(nowMax, j);
                }
            }
            temp+=nowMax;
            for(int k=2; k<=n;k++){
                nowMax=0;
                int findIdx=0;
                for(int l=1; l<=6;l++){
                    if(dice[k][l]==nowTop){
                        findIdx=l;
                        break;
                    }
                }
                nowBottom= nowTop;
                nowTop=dice[k][reverse[findIdx]];
                for(int m=1; m<=6;m++){
                    if(m != nowTop && m!=nowBottom){
                        nowMax=Math.max(nowMax, m);
                    }
                }
                temp+=nowMax;
            }
            res=Math.max(temp,res);
        }
    }

}

