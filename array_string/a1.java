class Solution {
    public int removeElement(int[] nums, int val) {
        //遍历数组, 如果数组中出现了元素val
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i];
                k++;
            }
        }

        return k;
    }
}