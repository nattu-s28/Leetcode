# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: ListNode | None, n: int) -> ListNode | None:
        if not head.next and n == 1:
            return None
        curr = head
        length1 = 0
        while curr:
            length1 += 1
            curr = curr.next
        length1 = length1 - n + 1
        length2 = 1
        prev = curr = head
        while length2 != length1:
            length2 += 1
            prev = curr
            curr = curr.next
        if length2 == 1:
            return head.next
        prev.next = curr.next
        return head 