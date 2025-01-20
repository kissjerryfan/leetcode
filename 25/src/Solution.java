class Solution {
    public ListNode reverseKGroup(ListNode head, int k) {
        //统计节点个数
        int n = 0;
        for (ListNode cur = head; cur != null; cur = cur.next) {
            n++;
        }
        ListNode pre = null;
        ListNode cur = head;
        ListNode dummy = new ListNode(0,head);
        ListNode p0 = dummy;
        for (;n >= k; n -= k) {
            for (int i = 0; i < k; i++) {
                ListNode nxt = cur.next;
                cur.next = pre;
                pre = cur;
                cur = nxt;
            }
            ListNode nxt = p0.next;
            p0.next.next = cur;
            p0.next = pre;
            p0 = nxt;
        }
        return dummy.next;
    }
}
