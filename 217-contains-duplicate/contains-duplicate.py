class Solution:
    def containsDuplicate(self, nums: list[int]) -> bool:
        fq = {}
        for item in nums:
            if item in fq:
                fq[item] += 1
            else:
                fq[item] = 1
        for val in fq.values():
            if val > 1:
                return True
        return False
                