
/*
下标+当前下标的元素
2+0=2 3+1=4, 
3+0=3 3+0 = 3

*/


class Solution {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        int k = 0;

        for ( int i = 0; i < len; i++) {
            if (i > k) {
                return false;
            }
            
            //最大可以到达
            k = Math.max(k, i+nums[i]);
        }

        return true;

    }
}