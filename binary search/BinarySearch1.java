import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class BinarySearch1 {
    static final Scanner sc = new Scanner(System.in);
    static int n,m;

    public static void countingSort( int[] comp, int[] client){
        int max = Arrays.stream(comp).max().getAsInt();
        int[] arr= new int[max+1];
        for(int i=0;i<max;i++){
            arr[i]=0;
        }

        for(int i=0; i<n;i++){
            arr[comp[i]]=1;
        }

        for(int i=0; i<m;i++){
            if(arr[client[i]]>0){
                System.out.printf("yes ");
            }else{
                System.out.print("no ");
            }
        }
    }

    public static int binarySearch( int[] comp, int find) {
        int start = 0;
        int end = n-1;
        Arrays.sort(comp);
        while (start <= end) {
            int mid = (start + end) / 2;
            if (comp[mid] == find) {
                return mid;
            } else if (comp[mid] < find) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void hashSet(int[] comp, int[] client){
        HashSet<Integer> company = new HashSet<>();
        for (int value: comp) {
            company.add(value);
        }

        for (int find: client) {
            if(company.contains(find)){
                System.out.printf("yes ");
            }else{
                System.out.print("no ");
            }
        }
    }


    public static void main(String[] args) {
        n= sc.nextInt();
        int[] comp =new int[n];
        for(int i=0;i<n;i++){
            comp[i]= sc.nextInt();
        }

        m =sc.nextInt();
        int[] client = new int[m];
        for(int i=0; i<m;i++){
            client[i]=sc.nextInt();
        }

        countingSort(comp,client);
        System.out.println();
        for (int find:client) {
            int result = binarySearch(comp, find);
            if(result==-1){
                System.out.print("no ");
            }else{
                System.out.printf("yes ");
            }
        }
        System.out.println();
        hashSet(comp,client);
        System.out.println();
    }
}
