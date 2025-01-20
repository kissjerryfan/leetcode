class Solution {
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
    public ListNode removeNodes(ListNode head) {
        ListNode head2 = reverseList(head);
        ListNode cur = head2;
        while (cur.next != null) {
            int nextVal = cur.next.val;
            if (cur.val > nextVal) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return reverseList(head2);
    }
}
