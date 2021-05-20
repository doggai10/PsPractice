import java.util.Scanner;

public class SequentialSearch {
    static  final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("생성할 원소 개수를 입력한 다음 한 칸 띄고 찾을 문자열을 입력하세요");
        String[] inputs = sc.nextLine().split(" ");
        int n = Integer.parseInt(inputs[0]);
        String find = inputs[1];
        System.out.println("앞서 적은 원소 개수만큼 문자열을 입력하세요. 구분은 띄어쓰기 한칸으로 합니다.");
        String[] input= sc.nextLine().split(" ");
        int loc=0;
        for(int i=0; i<n; i++){
            if(input[i].equals(find)){
                loc=i+1;
                break;
            }
        }
        System.out.println(loc);

    }
}
