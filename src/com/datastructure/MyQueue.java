package com.datastructure;

public class MyQueue {

    int front;
    int rear;
    int arr[];
    int size;

    MyQueue(int size) {
        this.front = -1;
        this.rear = -1;
        this.arr = new int[size];
        this.size = size;
    }


    // Enqueue
    // Dequeue

    // isFull
    public boolean isFull() {
        return ((this.front == 0) && (this.rear==size-1));
    }

    // isEmpty
    public  boolean isEmpty() {
        return (this.front == this.rear);
    }

    public void enque(int data) throws Exception {

        if (this.isFull()) {
            throw new Exception("Queue overflow");
        } else {

            this.arr[++this.rear] = data;
        }
    }

    public int dequeue() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("Queue underflow");
        }

        return this.arr[++this.front];
    }

    public void resetQueue() {
        this.front = -1;
        this.rear = -1;
    }

    public void removeAll()  {

        try {
            while (true) {
                System.out.println(this.dequeue());
            }
        } catch (Exception e) {
            System.out.println("Queue is Empty please fill the Queue");
        } finally {
            this.resetQueue();
        }
    }

    public int peek() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("Queue underflow");
        } else {
            return this.arr[this.front];
        }
    }

    public static void main(String[] args) {
        MyQueue myQueue = new MyQueue(5);
        try {
            myQueue.enque(1);
            myQueue.enque(2);
            myQueue.enque(3);
            myQueue.enque(4);
            myQueue.enque(5);
            System.out.println("rear: "+ myQueue.rear);
            //System.out.println("peek: "+ myQueue.peek());
        } catch (Exception e) {
            e.printStackTrace();
        }

        myQueue.removeAll();
       System.out.println("Front: "+ myQueue.front);



    }

}
