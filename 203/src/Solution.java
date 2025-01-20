class Solution {
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;
        ListNode dummy = new ListNode(0,head);
        ListNode cur = dummy;
        while (cur.next != null) {
            int nextVal = cur.next.val;
            if (nextVal == val) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return dummy.next;
    }
}
