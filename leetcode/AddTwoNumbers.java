package algorithm.leetcode;

class ListNode {
      int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

public class AddTwoNumbers {
    public static void main(String[] args) {
        ListNode l1 = null, l2 =null;
        ListNode ans= new ListNode();
        ListNode start =ans;
        int up =0, add =0;
        while(true){
            if(l1==null && l2 ==null) add =up;
            else if(l1 == null)add =l2.val+up;
            else if(l2 == null)add = l1.val+up;
            else add=l1.val+l2.val+up;
            up=0;
            if(add>=10){
                up=1;
                add-=10;
            }
            ans.val = add;
            if(l1 !=null)l1=l1.next;
            if(l2 !=null) l2=l2.next;
            if(l1 == null && l2 == null && up==0) break;
            ans.next = new ListNode();
            ans = ans.next;
        }
    }
}
