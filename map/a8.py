class Solution:
    def containsNearbyDuplicate(self, nums: List[int], k: int) -> bool:
       #首先把模版写上
       m = {}
       for i, num in enumerate(nums):
        if num in m and i - m[num] <= k:
            return True
        m[num] = i
       return False