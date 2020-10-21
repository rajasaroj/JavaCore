package com.datastructure;

public class Bidirectional {

    Node head;
    Node tail;

    static class Node {
        Node prev;
        Node next;
        int data;

        Node (int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    public static Bidirectional insertBiNode(Bidirectional list, int data, boolean infront) {
        Node new_node = new Node(data);

        if (list.head == null) {
            list.head = new_node;
            list.tail = new_node;

        } else if (infront) {

            new_node.next = list.head; // point new_node to next node.
            list.head = new_node;      // shift head on new_node.

        } else {

            new_node.prev = list.tail; // save the reference of prevous last node (pont new_node to last node)
            list.tail.next = new_node; // point last node to new_node.
            list.tail = new_node;      // shift tail to last new_node.

        }

        return list;
    }

    public static void printList(Bidirectional list) {

        Bidirectional.Node curr = list.head;

        if (curr == null) {
            System.out.println(" list is empty");
        } else {

            while (curr != null) {
                System.out.println("Next element is --> " + curr.data);
                curr = curr.next;
            }

        }

    }

    public static Bidirectional insertInMiddle(Bidirectional list, int data, int index) {

        Node curr = list.head;

        if (curr == null) {
            System.out.println(" list is empty");
        } else {

            int count =1;
            while (curr != null) {

                if (count == index)
                {
                    Node new_node = new Node(data);
                    new_node.prev = curr;       // new_node previous side points to previus node.
                    new_node.next = curr.next;  // new_node next side points to next node.

                    curr.next.prev = new_node;  // point currents -> next node -> previous side points to new_node
                    curr.next = new_node;       // current next side points to new_node.
                    break;

                } else {
                    curr = curr.next;
                    count++;
                }
            }

        }
        return list;
    }


    public static Bidirectional deleteFromMiddle(Bidirectional list, int data) {
        Node curr = list.head;

        if (curr == null) {
            System.out.println(" list is empty");
        } else {

            int count =1;
            while (curr != null) {

                if (curr.data == data) {

                    curr.prev.next = curr.next;
                    curr.next.prev = curr.prev;
                    curr = null;
                    break;

                } else {
                    curr = curr.next;
                }

            }
        }
        return list;
    }


    public static void main(String[] args) {
        Bidirectional list = new Bidirectional();

        insertBiNode(list, 1, true);
        insertBiNode(list, 2, true);
        insertBiNode(list, 3, true);
        insertBiNode(list, 4, true);
        insertBiNode(list, 5, true);

        insertBiNode(list, 1, false);
        insertBiNode(list, 2, false);
        insertBiNode(list, 3, false);
        insertBiNode(list, 4, false);
        insertBiNode(list, 5, false);

        insertInMiddle(list, 0, 5);

        printList(list);
        deleteFromMiddle(list, 0);
        System.out.println("---------------after delete-------------------");
        printList(list);

    }

}
