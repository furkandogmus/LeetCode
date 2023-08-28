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
    public ListNode reverseList(ListNode head) {
        if(head==null) return null;
        if(head.next==null) return head;
        
        ListNode temp = head;
        ListNode temp2 = temp.next;
        ListNode temp3 = temp2.next;

        
        while(temp2 != null){
            temp2.next = temp;
            temp = temp2;
            if(temp3==null){break;}
            temp2 = temp3;
            temp3=temp3.next;
            
        }
        head.next = null;
        return temp2;
    }
}