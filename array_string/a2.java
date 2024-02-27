class Solution {
    public int removeDuplicates(int[] nums) {
        int count = 2;
        for ( int i = 2; i < nums.length; i++ ) {
            //以2为区间进行扫描
            if (nums[i] != nums[count - 2]) {
                nums[count] = nums[i];
                count++;
            }
        }

        return count;
    }

}