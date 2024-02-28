/*这道题, 题目说最大可以到达, 只要k>=i就可以了*/
class Solution {
    public boolean canJump(int[] nums) {
        int len = nums.length;
        int maxReach = 0;

        for ( int i = 0; i < len; i++ ) {
            if ( i > maxReach ) {
                return false;
            }
            
            //只要k>=i 当前位置都是可以到达
            maxReach = Math.max(maxReach, i+nums[i]);
        }


        if (maxReach >= nums.length - 1) {
            return true;
        } else {
            return false;
        }
    }
}