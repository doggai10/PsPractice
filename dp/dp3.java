import java.util.Scanner;

public class dp3 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();

        int[] arr = new int[n];
        arr[0]=1;
        arr[1]=3;

        for(int i=2;i<n;i++){
            arr[i]=(arr[i-1] + (arr[i-2]*2))%796796;
        }

        System.out.println(arr[n-1]);
    }
}
