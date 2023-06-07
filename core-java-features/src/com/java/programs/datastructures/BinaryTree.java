package com.java.programs.datastructures;

public class BinaryTree {
    private TreeNode root;

    BinaryTree() {
        root = null;
    }

    public void insert(int val) {
        root = insertNode(root, val);
    }

    private TreeNode insertNode(TreeNode current, int val) {
        if (current == null) {
            return new TreeNode(val);
        }
        if (val < current.val) {
            current.left = insertNode(current.left, val);
        } else if (val > current.val) {
            current.right = insertNode(current.right, val);

        }
        return current;
    }

    public boolean search(int val) {
        return searchNode(root, val);
    }

    private boolean searchNode(TreeNode current, int val) {
        if (current == null) {
            return false;
        }

        if (val == current.val) {
            return true;
        } else if (val < current.val) {
            return searchNode(current.left, val);
        } else {
            return searchNode(current.right, val);
        }
    }

    public void inorderTraversal() {
        inorderTraversal(root);
    }

    private void inorderTraversal(TreeNode current) {
        if (current != null) {
            inorderTraversal(current.left);
            System.out.print(current.val + " ");
            inorderTraversal(current.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(5);
        tree.insert(3);
        tree.insert(8);
        tree.insert(2);
        tree.insert(4);
        tree.insert(7);

        System.out.println("Inorder Traversal:");
        tree.inorderTraversal();

        int searchValue = 10;
        boolean found = tree.search(searchValue);
        System.out.println("\n\nSearching for " + searchValue + ": " + found);
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
        left = null;
        right = null;
    }
}
