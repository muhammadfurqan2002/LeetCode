public class ListNode {
       int val;
       ListNode next;
       ListNode() {}
       ListNode(int val) { this.val = val; }
       ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class ReverseKGroup {
    public ListNode reverseKGroup(ListNode head, int k) {
        if(head==null){
            return null;
        }
        ListNode cur=head,prev=null,next=null;
        int c=k;
        while(cur!=null && c>0){
            next=cur.next;
            cur.next=prev;
            prev=cur;
            cur=next;
            c--;
        }
        if(cur==null && c>0){
            cur=prev;
            prev=null;
            next=null;
            while(cur!=null){
                next=cur.next;
                cur.next=prev;
                prev=cur;
                cur=next;
            }   
        }
        if(c>0){
            return prev;
        }
        head.next=reverseKGroup(cur,k);
        return prev;
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);


        ReverseKGroup reverseKGroup = new ReverseKGroup();
        ListNode result = reverseKGroup.reverseKGroup(head, 2);
        
        while (result!=null) {
            System.out.println(result.data);
            result=result.next;
        }
    }
}