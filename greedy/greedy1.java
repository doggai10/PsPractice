import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class greedy1 {

    public static Scanner sc = new Scanner(System.in);
    public static ArrayList<Integer> arrayList = new ArrayList<>();
    public static void main(String[] args) {
        int n = sc.nextInt();
        for(int i=0; i<n;i++){
            arrayList.add(sc.nextInt());
        }
        Collections.sort(arrayList);

        int result=0;
        int count=0;
        for(int i=0;i<n;i++){
            count++;
            if(count>=arrayList.get(i)){
                count=0;
                result++;
            }
        }
        System.out.println(result);
    }
}
