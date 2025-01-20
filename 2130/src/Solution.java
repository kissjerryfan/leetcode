class Solution {
    private ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }
    private ListNode reverseList(ListNode head) {
        ListNode pre = null;
        ListNode cur = head;
        while (cur != null) {
            ListNode nxt = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nxt;
        }
        return pre;
    }
    public int pairSum(ListNode head) {
        ListNode mid = middleNode(head);
        ListNode head2 = reverseList(mid);
        int sum = 0;
        while (head2 != null) {
            sum = Math.max(sum,head.val + head2.val);
            head = head.next;
            head2 = head2.next;
        }
        return sum;
    }
}
