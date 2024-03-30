class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        c = 0
        d = 0
        for a in nums:
            for b in nums:
                if a+b == target:
                    if c != d:
                        return [c,d]
                d += 1
            d = 0
            c += 1
                    