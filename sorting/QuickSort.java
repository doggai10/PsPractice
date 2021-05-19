public class QuickSort {


    static int[] array = {5,7,9,0,3,1,6,2,4,8};

    static void quicksort(int start, int end){
        if(start >= end){
            return;
        }
        int pivot =start;
        int left =start+1;
        int right =end;
        while(left<=right){
            while(left<=end && array[left]<=array[pivot]){
                left++;
            }
            while(start<right && array[pivot]<=array[right]){
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
        quicksort(start,right-1);
        quicksort(right+1,end);
    }

    public static void main(String[] args) {
        quicksort(0, array.length-1);
        for (int value:array) {
            System.out.println(value);
        }
    }
}
