import java.util.Scanner;

public class dp4 {

    public static Scanner sc = new Scanner(System.in);
    public static final int max=99999;
    public static void main(String[] args) {
        int n =sc.nextInt();
        int money = sc.nextInt();
        int[] coins = new int[n];
        int[] answer = new int[money+1];
        for(int i=0; i<n;i++){
            coins[i]= sc.nextInt();
        }
        for(int i=0; i<money+1;i++){
            answer[i]=max;
        }
        answer[0]=0;
        for(int i=0; i<n;i++){
            for(int j=coins[i]; j<=money;j++){
                if(answer[j-coins[i]]!=max){
                    answer[j]=Math.min(answer[j-coins[i]]+1, answer[j]);
                }
            }
        }
        if(answer[money]==max){
            System.out.println(-1);
        }else{
            System.out.println(answer[money]);
        }


    }
}
