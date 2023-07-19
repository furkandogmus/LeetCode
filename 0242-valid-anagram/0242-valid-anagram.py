class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
        dic = dict()
        for char in s:
            if char in dic:
                dic[char] +=1
            else:
                dic[char] = 1
        
        for char in t:
            if char in dic:
                dic[char] -=1
            else:
                return False
        
        for key in dic.keys():
            if dic[key] != 0:
                return False
        return True
        