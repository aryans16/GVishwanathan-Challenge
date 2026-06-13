public class AddTwoNumbersMain {

    // 1. Definition for singly-linked list node (Standard LeetCode structure)
    public static class ListNode {
        int val;
        ListNode next;
        
        ListNode() {}
        
        ListNode(int val) { 
            this.val = val; 
        }
        
        ListNode(int val, ListNode next) { 
            this.val = val; 
            this.next = next; 
        }
    }

    // 2. The core Solution algorithm
    public static class Solution {
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
            ListNode dummyHead = new ListNode(0);
            ListNode tail = dummyHead;
            
            ListNode p = l1;
            ListNode q = l2;
            int carry = 0;

            while (p != null || q != null || carry != 0) {
                int x = (p != null) ? p.val : 0;
                int y = (q != null) ? q.val : 0;

                int sum = x + y + carry;
                carry = sum / 10;

                // Create and link the new node instantly
                tail.next = new ListNode(sum % 10);
                tail = tail.next;

                if (p != null) p = p.next;
                if (q != null) q = q.next;
            }

            return dummyHead.next;
        }
    }

    // Helper method to easily print the linked list in the console
    public static void printList(ListNode head) {
        ListNode temp = head;
        while (temp != null) {
            System.out.print(temp.val);
            if (temp.next != null) {
                System.out.print(" -> ");
            }
            temp = temp.next;
        }
        System.out.println();
    }

    // 3. Main method to run and verify the code locally
    public static void main(String[] args) {
        // Create first number: 2 -> 4 -> 3 (which represents 342)
        ListNode l1 = new ListNode(2);
        l1.next = new ListNode(4);
        l1.next.next = new ListNode(3);

        // Create second number: 5 -> 6 -> 4 (which represents 465)
        ListNode l2 = new ListNode(5);
        l2.next = new ListNode(6);
        l2.next.next = new ListNode(4);

        System.out.print("List 1: ");
        printList(l1);

        System.out.print("List 2: ");
        printList(l2);

        // Run the algorithm
        Solution solution = new Solution();
        ListNode result = solution.addTwoNumbers(l1, l2);

        System.out.print("Result: ");
        printList(result); // Expected output: 7 -> 0 -> 8 (which represents 807)
    }
}

