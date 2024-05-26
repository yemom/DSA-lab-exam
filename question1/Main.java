package finalLabExam.question1;

public class Main {
    public static void main(String[] args) {
        question1.question01 question1 = new question1.question01();

        question1.ListNode head = new question1.ListNode(1);
        head.next = new question1.ListNode(2);
        head.next.next = new question1.ListNode(3);
        head.next.next.next = new question1.ListNode(4);
        head.next.next.next.next = new question1.ListNode(5);

        System.out.println("Original List:");
        question1.printList(head);

        question1.ListNode reversedHead = question1.reverseList(head);

        System.out.println("Reversed List:");
        finalLabExam.question1.question1.printList(reversedHead);
    }
}
