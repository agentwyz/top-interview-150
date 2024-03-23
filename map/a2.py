class Sulation:
    def isIsomorphic(self, s: str, t: str) -> bool:
        #创建两个map
        map1, map2 = {}, {}

        for a, b in zip(s, t):
            
            if a in map1 and map1[a] != b:
                return False
            
            if b in map2 and map2[b] != a:
                return False
            
            map1[a] = b
            map2[b] = a

        return True
