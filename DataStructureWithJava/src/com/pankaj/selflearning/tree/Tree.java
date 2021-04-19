package com.pankaj.selflearning.tree;

public class Tree {

    private TreeNode root;

    public void insert(int value) {
        if (root == null) {
            root = new TreeNode(value);
        } else {
            root.insert(value);
        }
    }

    public void traverseInorder() {
        if (root != null) {
            root.traverseInorder();
        }
    }

    public void traversePreorder() {
        if (root != null) {
            root.traversePreorder();
        }
    }

    public TreeNode get(int value) {
        if (root != null) {
            return root.get(value);
        }
        return null;
    }

    public void delete(int value) {
        root = delete(root, value);
    }

    private TreeNode delete(TreeNode subTree, int value) {
        if (subTree == null) {
            return subTree;
        }
        if (value < subTree.getData()) {
            subTree.setLeftChild(delete(subTree.getLeftChild(), value));
        } else if (value > subTree.getData()) {
            subTree.setRightChild(delete(subTree.getRightChild(), value));
        } else {
            //case 1 & 2 : node to delete has 0 or 1 child(ren)
            if (subTree.getLeftChild() == null) {
                return subTree.getRightChild();
            } else if (subTree.getRightChild() == null) {
                return subTree.getLeftChild();
            }
            //case 3 : node to delete has 2 children
            //replace the value in the subTree node with the smallest value from the right subtree
            subTree.setData(subTree.getRightChild().min());
            //delete the node that has the smallest value in the right subtree
            subTree.setRightChild(delete(subTree.getRightChild(), subTree.getData()));
        }
        return subTree;
    }

    public int min() {
        if (root != null) {
            return root.min();
        }
        return Integer.MIN_VALUE;
    }

    public int max() {
        if (root != null) {
            return root.max();
        }
        return Integer.MAX_VALUE;
    }
}
