package com.datastructure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Consumer;

public class MyLinkList {

    Node head = null;
    Node tail = null;

    class Node {

        int data;
        Node next;

        Node (int data) {
            this.data = data;
            this.next = null;
        }
    }

    public MyLinkList insertNode(MyLinkList list, int data) {

        Node new_node = new Node(data);

        // if linklist is empty
        if (list.head == null) {

            list.head = new_node;
            list.tail = new_node;

        } else { // if linklist is non empty
             new_node.next =  list.head;
             list.head = new_node;
        }
        return list;
    }

    public void printList(MyLinkList list) {

        Node curr = list.head;

        if (curr == null) {
            System.out.println(" list is empty");
        } else {

            while (curr != null) {
                System.out.println("Next element is --> " + curr.data);
                curr = curr.next;
            }

        }

    }


//    public MyLinkList insertAtinMiddle(MyLinkList list, int data, int position) {
//        Node node = new Node(data);
//
//        Node curr = list.head;
//        Node prev = null;
//
//        for (int i=0; i<position; i++) {
//            prev = curr;
//            curr = curr.next;
//        }
//
//        prev.next = node;
//        node.next = curr;
//
//
//        return list;
//    }


    public MyLinkList insetAtEnd(MyLinkList list, int data) {

        Node new_node = new Node(data);

        // if linklist is empty
        if (list.head == null) {

            list.head = new_node;
            list.tail = new_node;

        } else {
            list.tail.next = new_node;
            list.tail = new_node;
        }

        return list;
    }

    public MyLinkList insertInMiddle(MyLinkList list, int data, int index) {

        // if linklist is empty
        if (list.head == null) {
            System.out.println("List is empty");

        } else if (index == 0) {
            return list.insertNode(list, data);
        } else {

            Node curr = list.head;

            int count = 1;
            while (curr != null) {
                if (count == index) {

                    Node new_node = new Node(data);
                    new_node.next = curr.next;
                    curr.next = new_node;
                    break;

                } else {
                    count++;
                    curr = curr.next;
                }
            }
        }
        return list;
    }

    public static void main(String[] args) {
        MyLinkList myLinkList = new MyLinkList();
        myLinkList.insertNode(myLinkList, 1);
        myLinkList.insertNode(myLinkList, 2);
        myLinkList.insertNode(myLinkList, 3);
        myLinkList.insertNode(myLinkList, 4);
        myLinkList.insertNode(myLinkList, 5);
        //myLinkList.insertAtinMiddle(myLinkList, 88, 2);

        //myLinkList.insetAtEnd(myLinkList, 1);
        //myLinkList.insetAtEnd(myLinkList, 2);
        //myLinkList.insetAtEnd(myLinkList, 3);
        //myLinkList.insetAtEnd(myLinkList, 4);
        //myLinkList.insetAtEnd(myLinkList, 5);

//        myLinkList.insertInMiddle(myLinkList, 0, 5);
//
//        myLinkList.printList(myLinkList);
       // myLinkList.rewind(myLinkList, myLinkList.head);

        //myLinkList.reverseLinkedList(myLinkList);
        myLinkList.printList(myLinkList);


    }

    // This will only print the data in reverse.
    public void rewind(MyLinkList list, Node curr) {
        if (curr != null) {
            rewind(list, curr.next);
            System.out.println(curr.data);
        }
    }

    public MyLinkList reverseLinkedList(MyLinkList list) {
        Node prev = null;
        Node curr = list.head;
        Node nextNode = list.head;

        while (curr != null) {
            nextNode = curr.next; // move the nextNode pointer to the next adjacent node.
            curr.next = prev;     // point the current node to the previous adjacent node.
            prev = curr;          // move prev pointer to current node.
            curr = nextNode;      // move current pointer to next node.
        }

        // As the link list is reverted swap the head and tail
        Node temp = list.head;
        list.head = list.tail;
        list.tail = temp;


        List<String> std = new ArrayList<>();
        Map<String, Consumer<List> > st = new HashMap<>();

        st.put("S", (x)-> std.add("sd") );

        System.out.println("-------");
        System.out.println(std);

        return list;
    }

}
