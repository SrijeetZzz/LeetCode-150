public class PartitionList {
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
    public static ListNode partition(ListNode head, int x) {
        ListNode small = new ListNode(0);
        ListNode higher = new ListNode(0);
        ListNode smallHead = small;
        ListNode highHead = higher;
        while(head!=null){
            if(head.val<x){
            smallHead.next = head;
            smallHead=smallHead.next;
        }
        else{
            highHead.next = head;
            highHead=highHead.next;
        }
        head=head.next;
        }
        highHead.next=null;
        smallHead.next = higher.next;
        return small.next;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(4, new ListNode(3, new ListNode(2, new ListNode(5 , new ListNode(2))))));
        ListNode result = partition(head, 3);
        ListNode curr = result;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
}
