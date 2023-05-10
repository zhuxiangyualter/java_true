package STL_bg.Trees;/*
 *  @author 渚相玉
 *  @verion 2.6.5
 *  @Session Study
 */

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class first_end {
    public static void main(String[] args) {

    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val) {
        this.val = val;
    }
}

class Solution {
    List<Integer> preorder = new ArrayList<>();
    Map<Integer, Integer> inorderMap = new HashMap<>();

    public List<Integer> constructFromInorderPostorder(int[] inorder, int[] postorder) {
        int n = inorder.length;

        for (int i = 0; i < n; i++) {
            inorderMap.put(inorder[i], i);
        }

        buildTree(inorder, postorder, 0, n - 1, 0, n - 1);

        return preorder;
    }

    private void buildTree(int[] inorder, int[] postorder, int inStart, int inEnd, int postStart, int postEnd) {
        if (inStart > inEnd) {
            return;
        }

        int rootVal = postorder[postEnd];
        int rootIndex = inorderMap.get(rootVal);

        int leftSize = rootIndex - inStart;
        int rightSize = inEnd - rootIndex;

        preorder.add(rootVal);

        buildTree(inorder, postorder, inStart, rootIndex - 1, postStart, postStart + leftSize - 1);
        buildTree(inorder, postorder, rootIndex + 1, inEnd, postEnd - rightSize, postEnd - 1);
    }
}
