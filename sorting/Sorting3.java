package algorithm.sorting;

import java.util.*;

public class Sorting3 {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n= sc.nextInt();
        int k=sc.nextInt();
        Integer[] arrayA= new Integer[n];
        Integer[] arrayB= new Integer[n];

        for(int i=0;i<n;i++){
            arrayA[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            arrayB[i]=sc.nextInt();
        }

        Arrays.sort(arrayA);
        Arrays.sort(arrayB, Collections.reverseOrder());
        for(int i=0; i<k;i++){
            if(arrayA[i]<arrayB[i]){
                arrayA[i]=arrayB[i];
            }else{
                break;
            }
        }
        long result=0;
        for (int value: arrayA) {
            result+=value;
        }
        System.out.println(result);
    }
}
