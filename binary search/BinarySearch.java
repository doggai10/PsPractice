import java.util.Scanner;

public class BinarySearch {
    static final Scanner sc = new Scanner(System.in);



    public static int binary_search_recursion(String[] array, String find, int start, int end){
        if(start > end){
            return -1;
        }
        int mid = (start+end)/2;
        int value = Integer.parseInt(array[mid]);
        int search = Integer.parseInt(find);
        if(value==search){
            return mid;
        }else if(value>search){
            return binary_search_recursion(array,find,start,mid-1);
        }else{
            return binary_search_recursion(array,find,mid+1,end);
        }
    }

    public static int binary_search(String[] array, String find, int start, int end){
        while(start <=end){
            int mid = (start+end)/2;
            int value = Integer.parseInt(array[mid]);
            int search = Integer.parseInt(find);
            if(value==search){
                return mid;
            }else if(value>search){
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return -1;
    }



    public static void main(String[] args) {
        String[] inputs = sc.nextLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        String find =inputs[1];
        String[] array = sc.nextLine().split(" ");
        int result=binary_search_recursion(array,find,0,n-1);
        if(result==-1){
            System.out.println("원소가 존재하지 않습니다.");
        }else{
            System.out.println(result);
        }
        int result2 = binary_search(array, find, 0, n - 1);

        if (result2 == -1) {
            System.out.println("원소가 존재하지 않습니다.");
        } else {
            System.out.println(result2);
        }

    }
}
