from collections import Counter, defaultdict

class Solution:
    #主要使用一下字符串的一个糖
    def isAnagram(self, s: str, t: str) -> bool:
        s1 = "".join(sorted(s))
        s2 = "".join(sorted(t))

        return s1 == s2
    

    def isAngram2(self, s, t) -> bool:
        s1 = Counter(s)
        t1 = Counter(t)

    
    def isAnagram(self, s: str, t: str) -> bool:

        if len(s) != len(t):
            return False
        
        a = defaultdict(int)
        for c in s:
            a[c] += 1
        
        for c in t:
            a[c] -= 1

        for i in a.values():
            if i != 0:
                return False
        
        return True
    