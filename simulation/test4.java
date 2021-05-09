import java.util.Scanner;


public class test4{

	public static void main(String[] args){

		Scanner sc= new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int posX = sc.nextInt();
		int posY = sc.nextInt();
		int dir = sc.nextInt();	
		int count=1;
		int[][] map = new int[n][m];
		boolean[][] check = new boolean[n][m];
		for(int i=0; i<n; i++){
			for(int j=0 ; j<m; j++){
				check[i][j]=false;
				map[i][j]=sc.nextInt();
			}
		}
		check[posX][posY]=true;
		int[] dirX={-1,0, 1,0};
		int[] dirY={ 0,-1,0,1};
		int turn=0;
		while(true){
			if(dir==4){
				dir=0;
			}
			
			if(!check[posX+dirX[dir]][posY+dirY[dir]] && map[posX+dirX[dir]][posY+dirY[dir]]==0){
				turn=0;
				count++;
				posX+=dirX[dir];
				posY+=dirY[dir];
				check[posX][posY]=true;
				continue;
			}else{	
				dir++;
				turn++;
			}

			if(turn==4){
				if(map[posX-dirX[dir]][posY-dirY[dir]]==1){	
					break;
				}else{
					posX-=dirX[dir];
					posY-=dirY[dir];
					turn=0;
				}
				
			}
		}
		System.out.println(count);

	}


}
