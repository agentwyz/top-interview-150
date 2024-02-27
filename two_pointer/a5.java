class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        
        int len = nums.length; 

        List<List<Integer>> ans = new ArrayList<List<Integer>>();

        if (len < 3 || nums == null) {
            return ans;
        }

        for ( int i = 0; i < len; i++ ) {
            
            //第一处判重
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            
            int j = i + 1; int k = len - 1;

            while ( j < k ) {
                var target = nums[i] + nums[j] + nums[k];
                if ( target == 0 ) {
                   List<Integer> list = new ArrayList<Integer>();
                    list.add(nums[i]);
                    list.add(nums[j]);
                    list.add(nums[k]);
                    ans.add(list);


                    //第二处判重
                    while ( j < k && nums[j] == nums[j + 1] ) {
                        j++;
                    }

                    while ( j < k && nums[k] == nums[k - 1] ) {
                        k--;
                    }

                    //没有就向后遍历
                    j++;
                    k--;
                } else if ( target < 0 ) {
                    j++;
                } else if ( target > 0 ) {
                    k--;
                }
            }
        }

        return ans;
    }
}