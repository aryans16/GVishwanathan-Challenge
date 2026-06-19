

public class removelinkedlist {
    public static void main(String[] args) {
    Solution sol = new Solution();

    Solution.ListNode head = new Solution.ListNode(1);
    head.next = new Solution.ListNode(2);
    head.next.next = new Solution.ListNode(6);
    head.next.next.next = new Solution.ListNode(3);
    head.next.next.next.next = new Solution.ListNode(6);

    head = sol.removeElements(head, 6);

    while (head != null) {
        System.out.print(head.val + " ");
        head = head.next;
    }
}

    
}

class Solution{
    public static class ListNode{
        ListNode Head;
        ListNode next;
        int val;

        ListNode(){}
        ListNode(int val){this.val = val;}
        ListNode(int val , ListNode next){ this.val = val; this.next = next;}
    }

    public ListNode removeElements(ListNode Head, int val){
       
        ListNode dummy = new ListNode(-1,Head);

        ListNode previousnode = dummy;

        while(previousnode.next != null){
            if(previousnode.next.val != val){
                previousnode = previousnode.next;
            }
            else{
                previousnode.next = previousnode.next.next;
            }

        }
        return dummy.next;
        
    }
}