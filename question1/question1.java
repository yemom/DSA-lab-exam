package finalLabExam.question1;

public class question1 {
    public static void printList(ListNode reversedHead) {
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
        }
    }
    public static class question01 {
        public ListNode reverseList(ListNode head) {
            ListNode prev = null;
            ListNode current = head;

            while (current != null) {
                ListNode nextNode = current.next;
                current.next = prev;
                prev = current;
                current = nextNode;
            }

            return prev;
        }
        public void printList(ListNode head) {
            ListNode current = head;
            while (current != null) {
                System.out.print(current.val + " -> ");
                current = current.next;
            }
            System.out.println("null");
        }


    }

}
