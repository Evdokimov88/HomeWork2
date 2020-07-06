package ru.evdokimov.task26;


import java.util.Stack;

class Node {
    public int data;
    public Node leftChild;
    public Node rightChild;
Node(int data){
    this.data=data;
    leftChild=null;
    rightChild=null;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }
    public int count() {
        Stack<Node> stack = new Stack<>();
        stack.push(this);
        int count = 0;
        while (!stack.empty()) {
            Node node = stack.pop();
            count++;
            Node ch = getLeftChild();
            if (ch != null) stack.push(ch);
            ch = getRightChild();
            if (ch != null) stack.push(ch);
        }
        return count;
    }
}
class Tree {

    Node root;


    private Node addRecursive(Node node, int data) {
        if (node == null) {
            return new Node(data);
        }

        if (data < node.data) {
            node.leftChild = addRecursive(node.leftChild, data);
        } else if (data > node.data) {
            node.rightChild = addRecursive(node.rightChild, data);
        } else {
            return node;
        }

        return node;
    }


    public void add(int data) {
        root = addRecursive(root, data);
    }

}
    public class Main {
        public static void main(String[] args) {
            Tree tree = new Tree();
            tree.add(45);
            tree.add(17);
            tree.add(83);
            tree.add(3);
            tree.add(76);
            tree.add(22);
            tree.add(33);
            tree.add(100);
            tree.add(51);
            tree.add(1);
            tree.add(14);
            tree.add(89);
        }
    }
