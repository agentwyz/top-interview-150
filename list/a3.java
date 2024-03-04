class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode pre = new ListNode(0);
        ListNode tmp = pre;

       while ( list1 != null && list2 != null ) {
           if ( list1.val <= list2.val ) {
               tmp.next = list1;
               list1 = list1.next;
           } else {
               tmp.next = list2;
               list2 = list2.next;
           }

           tmp = tmp.next;
       }

       //如果没有合并完成, 直接添加到后面
       tmp.next = list1 == null ? list2 : list1;

       return pre.next;
    }
}