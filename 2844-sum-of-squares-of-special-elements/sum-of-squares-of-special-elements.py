class Solution:
    def sumOfSquares(self, nums: List[int]) -> int:
        idx = 1
        Sum = 0
        n = len(nums)
        for i in nums:
            if n % idx == 0:
                Sum += i*i
            idx += 1
        return Sum