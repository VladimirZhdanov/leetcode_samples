package com.homel.leetcode.samples;


public class SearchBST {

    public TreeNode searchBST(TreeNode root, int val) {

        if (root == null) return null;
        if (val == root.val) return root;

        return val > root.val ? searchBST(root.right, val) : searchBST(root.left, val);
    }

    public static void main(String[] args) {
        TreeNode tree = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7));
        SearchBST searchBST = new SearchBST();
        System.out.println(searchBST.searchBST(tree, 2));
    }
}


// Definition for a binary tree node.
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        return "TreeNode{" +
                "val=" + val +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
