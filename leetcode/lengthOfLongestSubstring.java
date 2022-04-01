package algorithm.leetcode;

public class lengthOfLongestSubstring {
    public static void main(String[] args) {
        String s ="";
        int[] alpha = new int [128];
        int left =0, right=0, length=0;
        while(right<s.length()){
            char now = s.charAt(right);
            alpha[now]++;

            while(alpha[now]>1){
                char remove = s.charAt(left);
                alpha[remove]--;
                left++;
            }

            length = Math.max(length, right-left+1);
            right++;
        }
    }
}
