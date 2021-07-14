package algorithm.greedy;

import java.util.Scanner;

public class test3{

	public static void main(String [] args) {

		Scanner sc = new Scanner(System.in);
		int n,m;
		n=sc.nextInt();
		m=sc.nextInt();
		int result=0;
		int temp=100001;
		int[][] arr = new int[n][m];
		for(int i=0; i<n;i++){
			for(int j=0; j<m;j++){
				arr[i][j]=sc.nextInt();
				if(j==0){
					temp=arr[i][j];
				}
				temp=(temp>arr[i][j])?arr[i][j]:temp;
			}
			result=(result<temp)?temp:result;
		}
		System.out.println(result);
		sc.close();
	}

}
