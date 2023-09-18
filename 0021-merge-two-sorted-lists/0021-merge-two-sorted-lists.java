class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if(list1==null) return list2;
        
        ListNode ls = new ListNode();
        ListNode temp = ls;
        while(list1!=null && list2!=null){
            if(list1.val>= list2.val){
                temp.val = list2.val;
                list2 = list2.next;
            }else{
                temp.val = list1.val;
                list1 = list1.next;
            }
            temp.next = new ListNode();
            temp = temp.next;
        }
        while(list1!=null){
            temp.val = list1.val;
            list1 = list1.next;
            if(list1!=null){
            temp.next = new ListNode();
            temp = temp.next;
            }
        }
        while(list2!=null){
            temp.val = list2.val;
            list2 = list2.next;
            if(list2!=null){
            temp.next = new ListNode();
            temp = temp.next;
            }
        }
        
        return ls;
    }
}