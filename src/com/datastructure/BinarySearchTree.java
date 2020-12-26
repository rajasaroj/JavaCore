package com.datastructure;



public class BinarySearchTree {

    static class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.left = null;
            this.right = null;
            this.data = data;
        }
    }

    public static Node addNode(Node node, int value) {

        if (node == null) {
            return  new Node(value);
        } else {

            if (value > node.data) {
                node.right = addNode(node.right, value);
            }

            if (value < node.data) {
                node.left = addNode(node.left, value);
            }
        }
        return node;
    }

    public static Node inoderTraversal(Node node) {
        if (node==null) {
            return null;
        }

        node.left = inoderTraversal(node.left);
        System.out.println(node.data);
        node.right = inoderTraversal(node.right);


        return node;
    }


    public static Node delete(Node node, int value) {

        if (node == null)
            return null;


        if (value < node.data) {
            node.left = delete(node.left, value);
        } else  {
            node.right = delete(node.right, value);
        }

        // leaf
        if (node.left == null && node.right == null && node.data == value) {
            node = null;
            return null;
        }

        // left orphan
        if (node.left != null && node.right == null && node.data == value) {
            Node orphan = node.left;
            System.out.println("delete "+ node.data);
            node = null;
            return orphan;
        }

        // right orphan
        if (node.left == null && node.right != null && node.data == value) {
            Node orphan = node.right;
            System.out.println("delete "+ node.data);
            node = null;
            return orphan;
        }

        if (node.left != null && node.right != null && node.data == value) {

            Node successor = node.right;

            while (successor.left != null) {
                successor = successor.left;
            }

            System.out.println("Overwritten "+ node.data);
            node.data = successor.data;

            node.right = delete(node.right, successor.data);
            return node;
        }

        return node;
    }



    public static void main(String[] args) {
        Node root = addNode(null, 5);
        root = addNode(root, 6);
        root = addNode(root, 7);
        root = addNode(root, 8);
        root = addNode(root, 9);
        root = addNode(root, 1);
        root = addNode(root, 2);
        root = addNode(root, 3);
        root = addNode(root, 4);
        root = addNode(root, 10);


//        delete(root, 5);
//        delete(root, 6);
//        delete(root, 7);
        inoderTraversal(root);
    }
}
