class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:
        res = {}
        for i in strs:
            lis = [0] * 26
            for j in i:
                index = ord(j) - ord('a')
                lis[index] += 1
            check = str(lis)
            if check not in res:
                res[check] = [i]
            else:
                res[check].append(i)
            
        return list(res.values())