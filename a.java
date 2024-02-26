class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int len1 = m - 1;
        int len2 = n - 1;
        int len = m + n - 1; //表示合并之后的数组长度

        while (len1 >= 0 && len2 >= 0) {
            //比较两者的值
            if (nums1[len1] > nums2[len2]) {
                nums1[len] = nums1[len1];
                 len--;
                len1--;   
            } else {
                nums1[len] = nums2[len2];
                len--;
                len2--;
            }
           
        }
        //因为我们知道&&是短路运算符号, 所以len1>0不满足
       System.arraycopy(nums2, 0, nums1, 0, len2 + 1);
    }
}