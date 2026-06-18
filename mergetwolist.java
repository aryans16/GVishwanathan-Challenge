public class mergetwolist {

    public static void main(String[] args){
        Solution sol = new Solution();
        Solution.ListNode list1 = new Solution.ListNode(1);
        list1.next = new Solution.ListNode(2);
        list1.next.next = new Solution.ListNode(4);

        Solution.ListNode list2 = new Solution.ListNode(1);
        list2.next = new Solution.ListNode(3);
        list2.next.next = new Solution.ListNode(4);

        Solution.ListNode result = sol.mergeTwoLists(list1, list2);

        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }

    }

    
}

class Solution{
    static class ListNode{
        ListNode Head;
        int val;
        ListNode next;
        ListNode(){}
        ListNode(int val){this.val = val;}
        ListNode(int val, ListNode next){this.val = val; this.next = next;}
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2){
        if(list1 == null ) return list2;
        if(list2 == null) return list1;

        if (list1.val <= list2.val){
            list1.next = mergeTwoLists(list1.next, list2);
            return list1;
        }else{
            list2.next = mergeTwoLists(list1, list2.next);
            return list2;

        }
    }

 }

