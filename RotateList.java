//O(K*N) Approach

public class RotateList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {
        }
        ListNode(int val) {
            this.val = val;
        }
        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, new ListNode(5)))));
        ListNode result = rotateRight(head,2);
        ListNode curr = result;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
    public static ListNode rotateRight(ListNode head, int k) {
        ListNode dummy = new ListNode(0, head);
        ListNode curr;
        ListNode prev;
        for(int i=0;i<k;i++){
            curr = dummy.next;
            prev = dummy;
            while(curr.next!=null){
                prev=curr;
                curr=curr.next;
            }
            curr.next=dummy.next;
            dummy.next=curr;
            prev.next=null;
            
        }
        return dummy.next;


    }
}
