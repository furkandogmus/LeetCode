class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        for c in range(len(nums)):
            for d in range(c+1,len(nums)):
                if nums[c]+nums[d] == target:
                    return [c,d]
                    