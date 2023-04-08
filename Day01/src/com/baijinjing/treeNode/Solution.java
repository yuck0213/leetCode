package com.baijinjing.treeNode;

import java.util.*;

public class Solution {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> nums = new ArrayList<>();
        Deque<TreeNode> stack = new ArrayDeque<>();
        if (root==null){
            return nums;
        }
        stack.push(root.left);
        while (!stack.isEmpty()) {
            TreeNode node = stack.pop();
            if (node != null) {
                nums.add(node.val);
            } else {
                continue;
            }
            if (node.left != null) {
                stack.push(node.left);
            }
            if (node.right != null) {
                stack.push(node.right);
            }
        }
        return nums;
    }
}
