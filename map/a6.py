class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        #首先使用target-list[1]
        #将值存入进map中, 在遍历中判断
    
        idx = {}  # 创建一个空哈希表（字典）
        for j, x in enumerate(nums):  # x=nums[j]
            if target - x in idx:  # 在左边找 nums[i]，满足 nums[i]+x=target
                return [idx[target - x], j]  # 返回两个数的下标
            idx[x] = j  # 保存 nums[j] 和 j