package finalLabExam.question3;

public class Main {
    public static void main(String[] args) {
        question3.CircularQueue q = new question3.CircularQueue(3);

        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.dequeue());
        q.enqueue(4);
        System.out.println(q.front());
        System.out.println(q.rear());
    }
}
