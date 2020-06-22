package ru.evdokimov.task26;
import java.util.ArrayList;
import java.util.List;
class Tree<T extends Comparable<T>> {
    private T val;
    public Tree left;
    public Tree right;
    private Tree parent;
    private List<T> listForPrint = new ArrayList<>();

    public T val() {
        return val;
    }

    public Tree left() {
        return left;
    }

    public Tree right() {
        return right;
    }

    public Tree parent() {
        return parent;
    }

    public Tree(T val, Tree parent) {
        this.val = val;
        this.parent = parent;
    }

    public void add(T... vals) {
        for (T v : vals) {
            add(v);
        }
    }

    public void add(T val) {
        if (val.compareTo(this.val) < 0) {
            if (this.left == null) {
                this.left = new Tree(val, this);
            } else if (this.left != null)
                this.left.add(val);
        } else {
            if (this.right == null) {
                this.right = new Tree(val, this);
            } else if (this.right != null)
                this.right.add(val);
        }
    }
}
public class Main{

   public static int countLeaves(Tree tree) {
        if (tree == null)
            return 0;
        else if (tree.left != null || tree.right != null) {
            return countLeaves(tree.left) + countLeaves(tree.right);
        } else {
            return 1;
        }
    }
    public static void main(String[] args) {
        Tree<Integer> tree = new Tree<>(33, null);
        tree.add(5, 35, 1, 20, 4, 17, 31, 99, 18, 19, 7, 12, 98, 120);
        System.out.println(countLeaves(tree));
    }
    }
