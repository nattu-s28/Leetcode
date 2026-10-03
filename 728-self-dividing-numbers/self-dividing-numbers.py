class Solution:
    def isDivide(self,num):
        anum = str(num)
        for i in anum:
            if i == '0' or num % int(i) != 0:
                return False
        return True
    def selfDividingNumbers(self, left: int, right: int) -> list[int]:
        alist = []
        for i in range(left,right+1):
            if self.isDivide(i):
                alist.append(i)
        return alist
