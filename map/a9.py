class Solution:
    def longestConsecutive(self, nums: List[int]) -> int:
        #k->[1, 2, 3, ]
        l = 0
        num_set = set(nums) #首先对数组进行去重

        for num in num_set:
            #如果num-1不在set中
            if num - 1 not in num_set:
                current = num
                l1 = 1
                #如果num+1在set中
                while current + 1 in num_set:
                    current += 1
                    l1 += 1

                l = max(l, l1)
        return l