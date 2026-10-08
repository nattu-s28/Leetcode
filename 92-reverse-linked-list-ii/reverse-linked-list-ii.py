# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseBetween(self, head: ListNode | None, left: int, right: int) -> ListNode | None:
        ls = []
        curr = head
        while curr:
            ls.append(curr.val)
            curr = curr.next

        ls = ls[:left-1] + ls[left-1:right][::-1] + ls[right:]
        head = ListNode(ls[0])
        curr = head
        for i in ls[1:]:
            curr.next = ListNode(i)
            curr = curr.next
        return head