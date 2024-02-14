class LargerNumKey(str):
    def __lt__(x,y):
        return x+y > y+x

class Solution:
    def largestNumber(self, nums: List[int]) -> str:
        largest =  "".join(sorted(map(str,nums),key=LargerNumKey))
        return '0' if largest[0] =='0' else largest