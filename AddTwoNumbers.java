public class AddTwoNumbers {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
    public static void main(String[] args) {
        ListNode l1 = new ListNode(2, new ListNode(3, new ListNode(4)));
        ListNode l2 = new ListNode(5, new ListNode(7, new ListNode(4)));
        ListNode result= addTwoNumbers(l1, l2);
        while (result != null) {
            System.out.print(result.val);
            if (result.next != null) System.out.print(" -> ");
            result = result.next;
        }
    }
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 != null && l1.next == null && l1.val == 0 && l2 != null && l2.next == null && l2.val == 0) {
        return new ListNode(0);
    }

    ListNode head = new ListNode();
    ListNode current = head;
    int carry = 0;

    ListNode curr1 = l1;
    ListNode curr2 = l2;

    while (curr1 != null || curr2 != null || carry != 0) {
        int val1 = (curr1 != null) ? curr1.val : 0;
        int val2 = (curr2 != null) ? curr2.val : 0;

        int sum = val1 + val2 + carry;
        carry = sum / 10;
        sum = sum % 10;

        current.next = new ListNode(sum);
        current = current.next;

        curr1 = (curr1 != null) ? curr1.next : null;
        curr2 = (curr2 != null) ? curr2.next : null;
    }

    ListNode result = head.next;
    if (result == null) {
        result = new ListNode(0);
    }
    return result;
    }
    
}
