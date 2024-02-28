/*
本题为leetcode141题
主要使用两种解法
1. hashset
2. 快慢指针*/

public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();

        while (head != null) {
            if (!set.add(head)) {
                return true;
            }

            head = head.next;
        }

        return false;
    }
}

public class Solution {
    public boolean hasCycle(ListNode head) {

        if (head == null || head.next == null) return false;

        //定义快慢两个指针
        ListNode slow = head;
        ListNode quick = head.next;

        while (slow!=quick) {
            
            //快指针总是先到
            if (quick == null || quick.next == null) {
                return false;
            }

            slow = slow.next;
            quick = quick.next.next;
        }

        return true;

    }
}