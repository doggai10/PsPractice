package algorithm.greedy;

import java.util.Scanner;

public class greedy3 {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String inputs = sc.nextLine();
        int count0=0;
        int count1=0;
        if(inputs.charAt(0)-'0'==0){
            count1++;
        }else{
            count0++;
        }
        for(int i=0; i<inputs.length()-1;i++){
            if(inputs.charAt(i) != inputs.charAt(i+1)){
                if(inputs.charAt(i+1)=='1'){
                    count0++;
                }else{
                    count1++;
                }
            }
        }
        System.out.println(Math.min(count0,count1));
    }
}
