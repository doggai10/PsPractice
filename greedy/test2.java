import java.util.Scanner;
import java.util.Arrays;
public class test2{

	public static void main(String[] args){

			int N,M,K, ans=0;
			Scanner sc = new Scanner(System.in);

			N=sc.nextInt();
			M=sc.nextInt();
			K=sc.nextInt();
			int[] arr = new int[N];
			for(int i=0; i<N;i++){
				arr[i]=sc.nextInt();
			}

			Arrays.sort(arr);

			int first=arr[N-1];
			int second=arr[N-2];

			while( M>0){
				for(int i=0; i<K;i++){
					if(M==0){
						break;
					}
					ans+=first;
					M-=1;
				}
				if(M==0){
					break;
				}
				ans+=second;
				M-=1;
			}
			System.out.println(ans);
		

	}


}
