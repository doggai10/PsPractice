package algorithm.leetcode;
import java.util.*;

public class TwoSum {

    public static void main(String[] args) {
        Map<Integer,Integer> map = new HashMap<>();
        int target=0;
        int [] answer ={0,0};
        int[] nums = new int[100];
        for(int num : nums){
            map.put(num, map.getOrDefault(num,0)+1);
        }
        boolean exit = false;
        for(int i=0; i<nums.length-1;i++){
            int num = nums[i];
            int find = target - num;
            if(map.get(find)==null) continue;
            if(num==find && map.get(find)==1) continue;
            for(int j=i+1; j<nums.length;j++){
                if(nums[j]==find){
                    answer[0]=i;
                    answer[1]=j;
                    exit=true;
                    break;
                }
            }
            if(exit) break;
        }
    }
}
