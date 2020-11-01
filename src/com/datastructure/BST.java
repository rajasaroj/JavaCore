package com.datastructure;



public class BST {

    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.left = null;
            this.right = null;
            this.data = data;
        }
    }


    public static Node addNode(Node node, int value) {

        if (node == null)
            return new Node(value);

        // Span on left
        if (value < node.data) {
            node.left = addNode(node.left, value);
        }

        // Span on right
        if (value >= node.data) {
            node.right = addNode(node.right, value);
        }
        return node;
    }


    public static Node display(Node node) {

        //save the root
        Node root = node;



        if (node.left != null) {
            node.left = display(node.left);
            System.out.println(node.data);
        }

        if (node.left == null && node.right==null)
            System.out.println(node.data);

        if (node.right != null) {
            node.right = display(node.right);

            if (node != root)
            System.out.println(node.data);
        }

      return node;
    };

    public static Node delete(Node node, int value) {

        if (node == null) {
            return null;
        }

        if(value > node.data) {
            node.right = delete(node.right , value);

        }

        if(value < node.data ) {
            node.left = delete(node.left, value);

        }

        if (node.right == null && node.left == null && node.data == value) {
            System.out.println(node.data +  " is deleted leaf ");
            node = null;
            return null;

        } else if (node.right == null && node.left != null && node.data == value){
            Node orphan = node.left;
            System.out.println(node.data +  " is deleted ");
            node = null;
            return orphan;

        } else if (node.left == null && node.right !=null && node.data == value) {
            Node orphan = node.right;
            System.out.println(node.data +  " is deleted ");
            node = null;
            return orphan;
            
        } else if (node.left != null && node.right !=null && node.data == value) {

            Node successor = node.right;
            while (successor.left != null) {
                successor = successor.left;
            }

            node.data = successor.data;
            node.right = delete(node.right, successor.data);
            return node;
        }




        return node;
    }

    public static void main(String[] args) {
        Node root = addNode(null, 5);

        // for right side of tree
        root = addNode(root, 8);
        root = addNode(root, 7);
        root = addNode(root, 6);

        // for left side
        root = addNode(root, 4);
        root = addNode(root, 3);
        root = addNode(root, 2);
        root = addNode(root, 1);

        // Delete leaf node "1"
        //root = delete(root, 1);
        root = delete(root, 5);
        root = delete(root, 6);

        System.out.println("display");
        if (root!= null)
        display(root);
        else
            System.out.println("root is null;");

    }

}
