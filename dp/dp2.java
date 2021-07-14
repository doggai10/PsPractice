package algorithm.dp;

import java.util.Scanner;

public class dp2 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        int[] answer = new int[n];
        answer[0]=arr[0];
        answer[1]=Math.max(arr[0],arr[1]);
        for(int i=2;i<n;i++){
            answer[i]=Math.max(answer[i-2]+arr[i],answer[i-1]);
        }
        System.out.println(answer[n-1]);
    }
}
