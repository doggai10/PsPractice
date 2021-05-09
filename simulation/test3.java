import java.util.Scanner;

class test3{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		String input = sc.nextLine();

		int posX = Integer.parseInt(input.substring(1));
		int posY = input.charAt(0)-'a';

		int[] dx = {2,2,-2,-2,1,1,-1,-1};
		int[] dy = {1,-1,1,-1,2,-2,2,-2};

		int count=0;
		for(int i=0; i<8;i++){
			if(posX+dx[i]>=1 && posX+dx[i]<=8 && posY+dy[i]>=1 && posY+dy[i]<=8){
				count++;
			}
		}
		System.out.println(count);
	}


}
