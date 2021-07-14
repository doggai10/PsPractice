package algorithm.greedy;

public class test1{

	public static void main(String[] args){
		
		int n=1260;
		int ans=0;
		int[] arr={500,100,50,10};
		for(int i=0;i<arr.length;i++){
			ans+=n/arr[i];
			n%=arr[i];
		}
		System.out.println(ans);
	}

}
