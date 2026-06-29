

public class swapnodes {
     public static void main(String[] args) {

        swap_nodes sol = new swap_nodes();

        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);

        System.out.print("Original List: ");
        printlist(head);

        head = sol.swapPairs(head);

        System.out.print("\nSwapped List: ");
        printlist(head);
    }

    public static void printlist(ListNode head){
        while(head != null){
            System.out.print(head.val + " ");
            head = head.next;  
        }
    }
}


class swap_nodes{
    public ListNode swapPairs(ListNode head){
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        ListNode prev = dummy;

        while(prev.next != null && prev.next.next != null){
            ListNode first = prev.next;
            ListNode second = first.next;

            first.next = second.next;
            second.next = first;
            prev.next = second;

            prev = first;
        }
        return dummy.next;

    }
}

class ListNode{

        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){this.val = val;}
        ListNode(int val,ListNode next){this.val = val; this.next = next;}

}