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
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null || k==0) return head;
        ListNode temp = head;
        int length = 0;
        while(temp!=null){
            length++;
            temp = temp.next;
        }
        k %=length;
        if(k==0) return head;
        temp = head;
        int step = length-k-1;
        while(step -- > 0){
            temp=temp.next;
        }
        ListNode temp2 = temp.next;
        ListNode temp3 = temp2;
        while(temp3.next!=null){
            temp3 = temp3.next;
        }
        temp3.next = head;
        temp.next = null;
        return temp2;
        
    }
}