import java.util.Arrays;

public class countingSort {
    public static void main(String[] args) {
        int[] array = {7,5,9,0,3,1,6,2,9,1,4,8,0,5,2};

        int[] count = new int[ Arrays.stream(array).max().getAsInt()+1];

        for(int i=0; i<array.length;i++){
            count[array[i]]++;
        }

        for (int i:count) {
            System.out.printf(i+" ");
        }
        System.out.println();

        for(int i=0; i<count.length;i++){
            for(int j=0;j<count[i];j++){
                System.out.printf(i+" ");
            }
        }
        System.out.println();
    }
}
