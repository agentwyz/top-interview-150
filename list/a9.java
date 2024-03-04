class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || k == 0) return head;
        int n = 0;
        ListNode tail = null;

        for (ListNode p = head; p != null; p = p.next) {
            tail = p;
            n++;
        }
    
        k %= n;

        ListNode p = head;

        
        for (int i = 0; i < n-k-1; i++) {
            p = p.next;
        }

        tail.next = head;
        head = p.next;
        p.next = null;
        return head;
    }
}