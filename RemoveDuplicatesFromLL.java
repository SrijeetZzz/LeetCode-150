public class RemoveDuplicatesFromLL {
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
        ListNode head = new ListNode(1, 
        new ListNode(2, 
        new ListNode(3, 
        new ListNode(3, 
        new ListNode(4, 
        new ListNode(4, 
        new ListNode(5)))))));
    
        ListNode result = deleteDuplicates(head);
        ListNode curr = result;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
    }
    public static ListNode deleteDuplicates(ListNode head) {
        if (head == null) return null;
    
        ListNode dummy = new ListNode(0, head);
        ListNode prev = dummy;
        ListNode curr = head;
    
        while (curr != null) {
            if (curr.next != null && curr.val == curr.next.val) {
                while (curr.next != null && curr.val == curr.next.val) {
                    curr = curr.next;
                }
                prev.next = curr.next;
            } else {
                prev = prev.next;
            }
            curr = curr.next;
        }
    
        return dummy.next;
    }
    
}
