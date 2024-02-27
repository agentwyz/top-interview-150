class Solution {
    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        
        int i = 0;
        int j = 0;
        
        int len = nums.length;
        int k = len / 2;

        while (i < len && j < len) {
            if (nums[i] == nums[j]) {
                j++;

                if (j - i > k) {
                    return nums[i];
                }
                
            } else {
                i = j;
            }
        }

        return 0;
    }
}