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
     public ListNode mergeKLists(ListNode[] lists) {
        if(lists.length == 0) return null;
    
        ArrayList<Integer> arr = new ArrayList<>();
        
        for(ListNode ls: lists){
            while(ls!=null){
                arr.add(ls.val);
                ls=ls.next;
            }
        }
        if(arr.size()==0) return null;
        Collections.sort(arr);
        ListNode list = new ListNode();
        ListNode temp = list;
        int index=0;
        for (int integer : arr) {
            index++;
            temp.val = integer;
            if(index== arr.size()){break;}
            temp.next = new ListNode();
            temp = temp.next;
            }
       
        return list;
    }
}