import java.util.Scanner;

public class BinarySearch2 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n=sc.nextInt();
        int m =sc.nextInt();

        int[]arr = new int[n];
        int start =0;
        int end=0;
        for(int i=0 ;i <n;i++){
            int input=sc.nextInt();
            if(end < input){
                end=input;
            }
            arr[i]=input;
        }
        // int asInt = Arrays.stream(arr).max().getAsInt();
        int result=0;
        while(start<=end){
            int total=0;
            int mid = (start+end)/2;
            for (int value: arr) {
                if( value >mid){
                    total+=value-mid;
                }
            }
            if(total<m){
                end=mid-1;
            }else{
                result=mid;
                start=mid+1;

            }
        }
        System.out.println(result);
    }
}
