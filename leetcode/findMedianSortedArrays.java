package algorithm.leetcode;

public class findMedianSortedArrays {
    public static void main(String[] args) {
        int[] nums1={1,2};
        int[] nums2={3,4};
        int total = nums1.length+nums2.length;
        int mid = total/2;
        double[] arr = new double [total];
        int i=0, iEnd= nums1.length;
        int j=0, jEnd = nums2.length;
        int k=0;
        while(i<iEnd && j<jEnd){
            if(nums1[i]<=nums2[j]){
                arr[k++]=nums1[i++];
            }else{
                arr[k++]=nums2[j++];
            }
        }
        while(i<iEnd){
            arr[k++]=nums1[i++];
        }
        while(j<jEnd){
            arr[k++]=nums2[j++];
        }
        if((total&1) ==1) System.out.println(arr[mid]);
        else System.out.println((arr[mid-1]+arr[mid])/2.0);
    }
}
