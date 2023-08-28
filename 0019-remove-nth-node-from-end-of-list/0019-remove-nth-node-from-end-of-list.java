/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null) return null;
        if(head.next.next== null){
            if(n==1) return new ListNode(head.val);
            else return head.next;
        }
        ListNode temp = head;
        if(n==1){
            while(temp.next.next!= null){
                temp = temp.next;
            }
            temp.next = null;
            return head;
        }
        int length = 0;
        while(temp!=null){
            temp = temp.next;
            length++;
        }
        temp = head;
        if(length==n){
            return head.next;
        }
        int index = length - n-1;
        while(index>0){
            index--;
            temp = temp.next;
        }
        ListNode temp2 = temp.next;
        temp.next = temp.next.next;
        temp2 = null;
        return head;
    }
}