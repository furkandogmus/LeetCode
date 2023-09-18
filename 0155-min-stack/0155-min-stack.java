class Node{
    int val;
    Node next;
    Node() {}
    Node(int val) { this.val = val; }
    Node(int val, Node next) { this.val = val; this.next = next; }
}

class MinStack {
    Node top;
    public MinStack() {

    }

    public void push(int val) {
        if(top==null){
            top = new Node(val);
        }else{
            Node temp = new Node(val);
            temp.next = top;
            top = temp;
        }
    }

    public void pop() {
        if(top==null) return;
        top = top.next;
    }

    public int top() {
        return top.val;
    }

    public int getMin() {
        Node temp = top;
        int min = Integer.MAX_VALUE;
        while(temp!=null){
            min = Math.min(min,temp.val);
            temp = temp.next;
        }
        return min;
    }
}