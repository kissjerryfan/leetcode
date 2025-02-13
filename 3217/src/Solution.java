import java.util.HashSet;
import java.util.Set;

class Solution {
    public ListNode modifiedList(int[] nums, ListNode head) {
        Set<Integer> set = new HashSet<>(nums.length);
        for (int x : nums) {
            set.add(x);
        }
        ListNode dummy = new ListNode(0,head);
        ListNode cur = dummy;
        while (cur.next != null) {
            int val = cur.next.val;
            if (set.contains(val)) {
                cur.next = cur.next.next;
            } else {
                cur = cur.next;
            }
        }
        return dummy.next;
    }
}
