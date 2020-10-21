package com.datastructure;

public class MyCircularQueue {

    int front;
    int rear;
    int arr[];
    int size;

    MyCircularQueue(int size) {
        this.front = -1;
        this.rear = -1;
        this.arr = new int[size];
        this.size = size;
    }

    // isfull
    public boolean isFull() {

        // if size of array is 8, if the queue is full without any removal
        // youre front will be on zero and your rear will be on size-1 index
        // OR
        // if the some element of the array is consumed from the front the front will shift to x index
        // and it will create clear space for rear to put some more objects
        // when the rear fill up all of those spaces created after consuming from front
        // it will always land up right behind the front index, hence rear+1 == front then the queue is full
        return ((this.front == 0) && (this.rear == this.size - 1)) ||   ((this.front == this.rear + 1));
    }


    // isEmpty
    public  boolean isEmpty() {

        // Supposed happened to be on zero by adding the element and your front will be on size-1 index conuming all the element,
        // the the queue will be empty
        // OR
        // if you're array has only 5 elements then you rear will be on 4th index
        // in this case you consumer front will always be behind rear aleast for one step.


        return  ( (this.rear == 0) && (this.front ==  this.size - 1) ) || ((this.rear == this.front + 1))   ;
    }


    // enque
    public void enque(int data) throws Exception {
        if (this.isFull() && this.front != -1) {
            throw new Exception("Queue overflow");
        } else {
            this.arr[++this.rear] = data;
        }
    }


    // deque
    public int dequeue() throws Exception {
        System.out.println("front during validation: "+ this.front);
        if (this.isEmpty() && this.rear != -1 ) {
            throw new Exception("Queue underflow");
        }

        System.out.println("front after validation: "+ (this.front + 1));
        System.out.println("Rear is at indx: "+ (this.rear));


      return   this.arr[++this.front];
    }


    // peek
    public int peek() throws Exception {
        if (this.isEmpty()) {
            throw new Exception("Queue underflow");
        }

        if (this.front == -1)
            return this.arr[this.front +1];

        return this.arr[this.front];
    }


    // removeAll
    public void removeAll() throws Exception {
       while (true) {
           System.out.println(this.dequeue());
       }
    }

    public static void main(String[] args) {
        MyCircularQueue myQueue = new MyCircularQueue(5);
        try {
            myQueue.enque(1);
            myQueue.enque(2);
            myQueue.enque(3);
            myQueue.enque(4);
            myQueue.enque(5);
            System.out.println("rear: "+ myQueue.rear);
            System.out.println("peek: "+ myQueue.peek());

            myQueue.removeAll();
            System.out.println("Front: "+ myQueue.front);




        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
