package algorithm.dp;

import java.util.Scanner;

public class dp1 {

    public static long[] answer = new long[30001];

    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        answer[1]=0;
        answer[2]=1;
        answer[3]=1;
        answer[4]=2;
        answer[5]=1;
        int n = sc.nextInt();
        for(int i=6;i<=n;i++){
            answer[i]=answer[i-1]+1;
            if(i%5==0){
                answer[i]=answer[i]>answer[i/5]+1?answer[i/5]+1:answer[i];
            }
            if(i%3==0){
                answer[i]=answer[i]>answer[i/3]+1?answer[i/3]+1:answer[i];
            }
            if(i%2==0){
                answer[i]=answer[i]>answer[i/2]+1?answer[i/2]+1:answer[i];
            }

        }
        System.out.println(answer[n]);
    }
}
