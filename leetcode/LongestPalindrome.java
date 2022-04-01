package algorithm.leetcode;

public class LongestPalindrome {
    public static void main(String[] args) {
        String s ="babcd";
        int len = s.length();
        boolean[][] arr = new boolean[len][len];

        int start = 0;
        int maxLength=1;
        for(int i=0;i <len;i++){
            arr[i][i]=true;
        }

        for(int i=0; i<len-1;i++){
            if(s.charAt(i)== s.charAt(i+1)){
                arr[i][i+1]=true;
                start=i;
                maxLength=2;
            }
        }

        for(int k=3;k <=len;k++){
            for(int i=0; i<len-k+1; i++){
                int j = i+k-1;
                if(arr[i+1][j-1] && s.charAt(i)==s.charAt(j)){
                    arr[i][j]=true;
                    if(k>maxLength){
                        start=i;
                        maxLength=k;
                    }
                }
            }
        }
        String ans= s.substring(start, start+maxLength);
        System.out.println("ans = " + ans);
    }
}
