class Solution:
    def groupAnagrams(self, strs: List[str]) -> List[List[str]]:

        dic = {}

        for string in strs:
            dic[string] = self.createDictonary(string)

        lisT= []
        visited = [0]* len(strs)
        for i in range(len(strs)):
            if visited[i]: continue
            list0 = [strs[i]]
            for j in range(i+1,len(strs)):
                if dic[strs[i]] == dic[strs[j]]:
                    list0.append(strs[j])
                    visited[j] = 1
            if list0 not in lisT:
                lisT.append(list0)
        return lisT
    
    
    
    def createDictonary(self, str):
        dic = dict()
        for char in str:
            if char in dic:
                dic[char] +=1
            else:
                dic[char] = 1
        return dic