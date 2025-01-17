class Solution:
    def runningSum(self, nums: List[int]) -> List[int]:
        sum = nums.copy()
        
        sum[0] = nums[0]
        for i in range(1, len(nums)):
            sum[i] = sum[i - 1] + nums[i]
        return sum