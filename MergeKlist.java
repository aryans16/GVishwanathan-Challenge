public class MergeKlist {

    static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }

    static class Solution {

        public ListNode mergeKLists(ListNode[] lists) {
            if (lists == null || lists.length == 0) {
                return null;
            }

            return mergeSort(lists, 0, lists.length - 1);
        }

        private ListNode mergeSort(ListNode[] lists, int left, int right) {
            if (left == right) {
                return lists[left];
            }

            int mid = left + (right - left) / 2;

            ListNode l1 = mergeSort(lists, left, mid);
            ListNode l2 = mergeSort(lists, mid + 1, right);

            return mergeTwoLists(l1, l2);
        }

        private ListNode mergeTwoLists(ListNode l1, ListNode l2) {
            ListNode dummy = new ListNode(0);
            ListNode current = dummy;

            while (l1 != null && l2 != null) {
                if (l1.val <= l2.val) {
                    current.next = l1;
                    l1 = l1.next;
                } else {
                    current.next = l2;
                    l2 = l2.next;
                }
                current = current.next;
            }

            if (l1 != null) {
                current.next = l1;
            }

            if (l2 != null) {
                current.next = l2;
            }

            return dummy.next;
        }
    }

    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {

        // List 1: 1 -> 4 -> 5
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(5);

        // List 2: 1 -> 3 -> 4
        ListNode l2 = new ListNode(1);
        l2.next = new ListNode(3);
        l2.next.next = new ListNode(4);

        // List 3: 2 -> 6
        ListNode l3 = new ListNode(2);
        l3.next = new ListNode(6);

        ListNode[] lists = {l1, l2, l3};

        Solution sol = new Solution();
        ListNode result = sol.mergeKLists(lists);

        System.out.print("Merged List: ");
        printList(result);
    }
}