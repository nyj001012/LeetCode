class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        shuffle = list()
        for i in range(n):
            shuffle.append(nums[i])
            shuffle.append(nums[n + i])
        return shuffle