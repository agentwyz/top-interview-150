class Solution:
    def wordPattern(self, pattern: str, s: str) -> bool:
        sp = s.split(" ")       #表示以空格进行分隔
        map1, map2 = {}, {}

        if len(sp) != len(pattern):
            return False

        for s1, s2 in zip(pattern, sp):
            if s1 in map1 and map1[s1] != s2:
                return False
            if s2 in map2 and map2[s2] != s1:
                return False
            
            map1[s1] = s2
            map2[s2] = s1
        
        return True