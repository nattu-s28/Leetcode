# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: ListNode | None) -> bool:
        curr = head
        ls = []
        while curr:
            ls.append(curr.val)
            curr = curr.next
        for i in range(len(ls)):
            if i > len(ls)-i-1:
                break
            if ls[i] != ls[len(ls)-i-1]:
                return False
        return True