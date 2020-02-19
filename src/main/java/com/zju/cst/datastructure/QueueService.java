package com.zju.cst.datastructure;

public interface QueueService {
    boolean isFull();
    boolean isEmpty();
    int size();
    void addQueue(int n);
    int getQueue();
    void showQueue();
}
