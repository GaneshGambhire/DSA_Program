package Demo;

class Queue {
    private int[] queueArray;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    // Constructor to initialize the queue
    public Queue(int capacity) {
        this.capacity = capacity;
        this.queueArray = new int[capacity];
        this.front = 0;
        this.rear = -1;
        this.size = 0;
    }

    // Method to add an item to the queue
    public void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full. Cannot enqueue " + item);
            return;
        }
        rear = (rear + 1) % capacity;
        queueArray[rear] = item;
        size++;
        System.out.println("Enqueued: " + item);
    }

    // Method to remove an item from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int item = queueArray[front];
        front = (front + 1) % capacity;
        size--;
        System.out.println("Dequeued: " + item);
        return item;
    }

    // Method to get the front element
    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queueArray[front];
    }

    // Method to check if the queue is empty
    public boolean isEmpty() {
        return size == 0;
    }

    // Method to check if the queue is full
    public boolean isFull() {
        return size == capacity;
    }

    // Method to get the current size of the queue
    public int size() {
        return size;
    }
}

public class Queuedsa {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
    
        System.out.println("Front element is: " + queue.peek());
        queue.dequeue();
        queue.dequeue();
        System.out.println("Front element after dequeue is: " + queue.peek());

 
        System.out.println("Queue size is: " + queue.size());

        queue.enqueue(50);
        queue.enqueue(60);
        queue.enqueue(70);
      

        if (queue.isEmpty()) {
            System.out.println("Queue is empty");
        }
    }
}
