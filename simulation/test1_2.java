package algorithm.simulation;

import java.util.Scanner;
public class test1_2{

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		sc.nextLine();
		String inputs= sc.nextLine();
		String[] input=inputs.split(" ");
		
		int nx=0,ny=0,x=1,y=1;
		int[] dx= {0,0,-1,1};
		int[] dy= {-1,1,0,0};
		String[] move_type={"L", "R", "U", "D"};
		for(int i=0; i<input.length;i++){
			for(int j=0 ; j<move_type.length;j++){
				if(input[i].equals(move_type[j])){
					nx= x + dx[j];
					ny= y + dy[j];
					break;
				}
			}
		//	if(input[i].equals(move_type)){
		//		nx = x + dx[i];
		//		ny = y + dy[i];
		//	}
			
			if(nx<1 || ny <1 || nx > n || ny > n){
				continue;
			}
			x=nx;
			y=ny;
		}
	
		System.out.println(x+" "+y);
		sc.close();
	}



}

