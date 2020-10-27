package com.datastructure;

public class StackUsingQueue {

    int[] queue;
    int data;
    int front;
    int rear;
    int size;

    StackUsingQueue(int size) {
        queue = new int[size];
        front = -1;
        rear = -1;
        this.size = size;
    }

    void insert(int data) {

        if (front == -1) {
            queue[++rear] = data;
            front = 0;
        } else if (front == 0 && rear == size-1) {
            System.out.println("Queue overflow");
        } else {
            queue[++rear] = data;
        }

    }

    int pop() {
        if (front == -1 || front == rear+1) {
            System.out.println("queue underflow");
        } else {
            int a = queue[front];
            front++;
            return a;
        }

        return -1;
    }

    int stackify() {
        if (front == 0 && rear == -1) {
            System.out.println("queue underflow");
        } else {
            int a = queue[rear];
            --rear;
            return a;
        }
        return rear;
    }


    public static void main(String[] args) {

        StackUsingQueue stackUsingQueue = new StackUsingQueue(5);
        stackUsingQueue.insert(1);
        stackUsingQueue.insert(2);
        stackUsingQueue.insert(3);
        stackUsingQueue.insert(4);
        stackUsingQueue.insert(5);

//        System.out.println(stackUsingQueue.pop());
//        System.out.println(stackUsingQueue.pop());
//        System.out.println(stackUsingQueue.pop());
//        System.out.println(stackUsingQueue.pop());
//        System.out.println(stackUsingQueue.pop());
        int a;
        do {
             a = stackUsingQueue.stackify();

            if (a == -1)
                break;

            System.out.println(a);

        } while (true);

    }

}
