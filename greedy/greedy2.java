package algorithm.greedy;

import java.util.Scanner;

public class greedy2 {
    public static Scanner sc  = new Scanner(System.in);

    public static void main(String[] args) {
        String inputs = sc.nextLine();
        long result = inputs.charAt(0) - '0';
        for(int i=1; i<inputs.length();i++){
            int num= inputs.charAt(i)-'0';
            if(num<=1 || result<=1){
                result+=num;
            }else{
                result*=num;
            }
        }
        System.out.println(result);
    }
}
