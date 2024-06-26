package gr.aueb.cf.ch14.model;

public class QueueManager {

    private final static QueueManager INSTANCE = new QueueManager();
    private final int[] queue;
    private int pivot;

    private QueueManager() {
        queue = new int[100];
        pivot = -1;
    }

    public static QueueManager getInstance() {
        return INSTANCE;
    }

    public void enQueue(int num) {
        if (isFull()) {
            throw new RuntimeException("Queue is full");
        }
        queue[++pivot] = num;
    }

    public int deQueue() {
        if (isEmpty()) {
            throw new RuntimeException("Queue is empty");
        }
        int valueToReturn = queue[0];
        pivot--;
        shiftQueueLeft();
        return valueToReturn;
    }


    public void shiftQueueLeft() {
        for (int i = 0; i <= pivot; i++) {
            queue[i] = queue[i + 1];
        }
    }

    public boolean isEmpty() {
        return pivot == -1;
    }

    public boolean isFull() {

        return pivot == queue.length - 1;
    }

    public void traverseQueue() {
        for (int i = pivot; i >= 0; i--) {
            System.out.println(queue[i]);
        }
    }
}
