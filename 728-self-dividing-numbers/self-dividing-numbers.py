class Solution:
    def isDivide(self,num: int) -> bool:
        temp = num
        while(temp != 0):
            i = temp % 10
            temp //= 10
            if i == 0 or num % i != 0:
                return False
        return True
    def selfDividingNumbers(self, left: int, right: int) -> list[int]:
        alist = []
        for i in range(left,right+1):
            if self.isDivide(i):
                alist.append(i)
        return alist
