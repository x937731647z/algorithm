package com.zju.cst.datastructure;

/**
 * @author wulixz
 * @date 10/23/19 : 3:22 PM
 * @introduction :
 */
public class ArrayQueueImpl implements QueueService {
    private int maxSize;
    private int front;
    private int rear;
    private int[] array;

    public ArrayQueueImpl(int maxSize) {
        this.maxSize = maxSize;
        array = new int[maxSize];
        front = -1;
        rear = -1;
    }

    @Override
    public boolean isFull() {
        return rear == maxSize - 1;
    }

    @Override
    public int size() {
        return rear - front;
    }

    @Override
    public boolean isEmpty() {
        return front == rear;
    }

    @Override
    public void addQueue(int n) {
        if (this.isFull()) {
            System.out.println("the queue is full");
            return;
        }
        rear++;
        array[rear] = n;
    }

    @Override
    public int getQueue() {
        if (this.isEmpty()) {
            throw new NullPointerException("the queue is empty");
        }
        front++;
        return array[front];
    }

    @Override
    public void showQueue() {
        if (this.isEmpty()) {
            throw new NullPointerException("the queue is empty");
        }
        for (int i = 0; i < array.length; i++) {
            System.out.printf("arr[%d] : %d\t", i, array[i]);
        }

    }
}

class testArrayQueue {
    public static void main(String[] args) {
        ArrayQueueImpl aq = new ArrayQueueImpl(5);
        aq.addQueue(1);
        aq.addQueue(2);
        aq.addQueue(3);
        aq.addQueue(4);
        aq.addQueue(5);
        aq.addQueue(6);
        aq.showQueue();
        System.out.println();
        int len = aq.size();
        for (int i = 0; i <= len; i++) {

            try {
                System.out.printf(aq.getQueue() + "\t");
            } catch (Exception e) {
//                e.printStackTrace();
            }
        }
//        aq.getQueue();
//        aq.getQueue();
//        aq.getQueue();
//        aq.getQueue();
//        aq.getQueue();
//        aq.getQueue();
    }
}