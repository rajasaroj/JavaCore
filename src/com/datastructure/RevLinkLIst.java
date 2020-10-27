package com.datastructure;


class Node {

    public int data;
    public Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }


}

public class RevLinkLIst {

    private Node head;
    private Node tail;

    RevLinkLIst() {
        this.head = null;
        this.tail = null;
    }

    public void insertFromBack(int data) {

        Node newNode = new Node(data);

        if (tail == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public void display() {

        Node current = head;

        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }


    public void reverse() {
        Node current = head;
        Node Cnext = head.next;
        Node Cprev = null;
        Node temp = null;

        /*  [1 | null] <- [2 | 50] <- [3 | 100] <- [4 | 200] -> null
               50           100          200          300
             ,             ,           ,,        prev ,  ,,  cur,next
         */

        while (current != null) {
            current.next = Cprev;
            Cprev = current;
            current = Cnext;

            if (Cnext!=null)
            Cnext = Cnext.next;
            else
                break;
        }

        temp = head;
        head = tail;
        tail = temp;


        }




    public static void main(String[] args) {
        RevLinkLIst revLinkLIst = new RevLinkLIst();
        revLinkLIst.insertFromBack(1);
        revLinkLIst.insertFromBack(2);
        revLinkLIst.insertFromBack(3);
        revLinkLIst.insertFromBack(4);
        revLinkLIst.insertFromBack(5);
        //revLinkLIst.display();
        revLinkLIst.reverse();
        revLinkLIst.display();
    }

}
