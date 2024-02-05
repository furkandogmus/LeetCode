# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def isPalindrome(self, head: Optional[ListNode]) -> bool:
        if head.next is None:
            return True
        
        ls = []
        while head is not None:
            ls.append(head.val)
            head=head.next
        
        
        for i in range(len(ls)//2):
            if ls[i] != ls[len(ls)-i-1]:
                return False
        return True