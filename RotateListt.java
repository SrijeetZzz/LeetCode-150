//O(n) approach

public class RotateListt {
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
        ListNode result = rotateRight(head, 2);
        ListNode curr = result;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }

    public static ListNode rotateRight(ListNode head, int k) {
        ListNode dummy = new ListNode(0, head);
        ListNode curr = dummy.next;
        int length = 0;
        while (curr != null) {
            length++;
            curr = curr.next;
        }
        k = k % length;
        if (k == 0)
            return head;
        curr = dummy.next;
        for (int i = 0; i < length - k - 1; i++) {
            curr = curr.next;
        }
        ListNode newHead = curr.next;
        curr.next = null;
        ListNode temp = newHead;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = dummy.next; 
        dummy.next = newHead;
        return dummy.next;

    }
}
