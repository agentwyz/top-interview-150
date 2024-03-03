class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        //定义两个指针, 1个快指针, 1个慢指针
        
        ListNode d = new ListNode(0, head);
        ListNode node = d;
        while (node.next != null && node.next.next != null) {
            int val = node.next.val;

            //首先判断下一个是不是一样的
            if (node.next.next.val == val) {
                while (node.next != null && node.next.val == val) {
                    node.next = node.next.next;
                }
            } else {
                node = node.next;
            }
        }

        return d.next;
    }
}