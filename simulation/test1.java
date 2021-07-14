package algorithm.simulation;

import java.util.Scanner;


public class test1{


	public static void main(String[] args){

		Scanner	sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.nextLine();
		int posX=1, posY=1;
		String input=sc.nextLine();
		String[] inputs=input.split(" ");
		for(int i=0; i<inputs.length;i++){
			if(inputs[i].equals("R") && posY<n){
						posY+=1;
			}
			if(inputs[i].equals("L") && posY>1){
						posY-=1;
			}
			if(inputs[i].equals("U")&& posX>1){
				posX-=1;
			}
			if(inputs[i].equals("D")&& posX<n){
				posX+=1;
			}
		}

		System.out.println(posX+" "+posY);
		sc.close();
	}



}
