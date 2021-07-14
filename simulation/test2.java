package algorithm.simulation;

import java.util.Scanner;
public class test2{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		long count=0;

		for(int i=0; i<n+1;i++){
			for(int j=0; j<60;j++){
				for (int k=0;k<60;k++){
					if(String.valueOf(i).contains("3") || String.valueOf(j).contains("3")||String.valueOf(k).contains("3")){
						count++;
					}

				}

			}
			
			
		}
		System.out.println(count);
		sc.close();
	}

}
