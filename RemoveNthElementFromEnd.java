public class RemoveNthElementFromEnd {
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
        ListNode result = removeNthFromEnd(head, 2);
        ListNode curr = result;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0, head);
        ListNode curr = head;
        int c=0;
        while(curr!=null){
            c++;
            curr=curr.next;
        }
        curr = dummy;
        for(int i=0;i<c-n;i++){
            curr=curr.next;
        }
        curr.next=curr.next.next;
        return dummy.next;
    }
}
