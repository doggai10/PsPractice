package algorithm.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Sorting1 {
    static  Scanner sc = new Scanner(System.in);


    public static void quicksort(int[] array, int start, int end){
        if(start>end){
            return;
        }
        int pivot=start;
        int left= start+1;
        int right =end;
        while(left<=right){
            while(left<=end && array[left]>=array[pivot]){
                left++;
            }
            while(right>start && array[pivot]>=array[right]){
                right--;
            }
            if(left>right){
                int temp = array[pivot];
                array[pivot]=array[right];
                array[right]=temp;
            }else{
                int temp = array[left];
                array[left]=array[right];
                array[right]=temp;
            }
        }
        quicksort(array,start,right-1);
        quicksort(array,right+1,end);

    }

    public static void main(String[] args) {
        int n=sc.nextInt();
        int[] array = new int[n];
        Integer[] arr = new Integer[n];
        for(int i=0; i<n;i++){
            array[i]=sc.nextInt();
            arr[i]=array[i];
        }
        quicksort(array,0,n-1);

        for (int value: array) {
            System.out.print(value+" ");
        }
        System.out.println();
        
        Arrays.sort(arr, Collections.reverseOrder());
        for (int value:arr) {
            System.out.print(value+" ");
        }
        System.out.println();
    }

}
