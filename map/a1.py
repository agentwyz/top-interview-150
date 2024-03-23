from collections import Counter

class Solution:
    def canConstruct(self, ransomNote: str, magazine: str) -> bool:
        #首先计算一下
        cnt = Counter(magazine)

        for c in ransomNote:
            cnt[c] -= 1

            if cnt[c] < 0:
                return False
        
        return True