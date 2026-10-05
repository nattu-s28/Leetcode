# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def middleNode(self, head: ListNode | None) -> ListNode | None:
        slow = head
        if not slow.next:
            return slow
        fast = head.next
        while fast.next:
            if not fast.next.next:
                return slow.next
            slow = slow.next
            fast = fast.next.next
        return slow.next