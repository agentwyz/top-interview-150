class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        table = {}
        for s in strs:
            #互为异位词排序后字符串相同
            s_ = "".join(sorted(s))

            if s_ not in table: #如果不在就加上
                table[s_] = [s]
            else:
                table[s_].append(s) #在就直接加到元素列表中
        
        return list(table.values())