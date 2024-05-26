package finalLabExam.question3;

public class question3 {
    static class CircularQueue {
        private int[] data;
        private int front;
        private int rear;
        private int count;
        private int size;

        public CircularQueue(int k) {
            size = k;
            data = new int[k];
            front = 0;
            rear = -1;
            count = 0;
        }

        public boolean enqueue(int value) {
            if (count == size) {
                return false; // Queue is full
            }
            rear = (rear + 1) % size;
            data[rear] = value;
            count++;
            return true;
        }

        public int dequeue() {
            if (count == 0) {
                throw new IllegalStateException("Queue is empty");
            }
            int result = data[front];
            front = (front + 1) % size;
            count--;
            return result;
        }

        public int front() {
            if (count == 0) {
                throw new IllegalStateException("Queue is empty");
            }
            return data[front];
        }

        public int rear() {
            if (count == 0) {
                throw new IllegalStateException("Queue is empty");
            }
            return data[rear];
        }

        public boolean isEmpty() {
            return count == 0;
        }


    }


}
