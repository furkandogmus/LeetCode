class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        
        for c in range(len(nums)):
            for d in range(len(nums)):
                if nums[c]+nums[d] == target and c!= d:
                    return [c,d]
                    