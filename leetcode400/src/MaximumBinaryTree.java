
import java.util.LinkedList;
import java.util.Queue;

public class MaximumBinaryTree {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int x) { val = x; }


    }

    public static void main(String[] args) {
        int[] a = {3, 2, 1, 6, 0, 5};
        MaximumBinaryTree b = new MaximumBinaryTree();
        TreeNode resutlt = b.constructMaximumBinaryTree(a);

    }


    public TreeNode constructMaximumBinaryTree(int[] nums) {
        // find the max number
        TreeNode root = construct(nums, 0, nums.length - 1);
        return root;
    }

    public int maximum(int[] nums, int left, int right) {
        if (left == right) return nums[left];
        int globalMaxIndex = left;
        for(int i = left + 1; i < right; i++) {
            if(nums[i] > nums[globalMaxIndex]) {
                globalMaxIndex = i;
            }
        }
        return globalMaxIndex;
    }

    public TreeNode construct(int[] array, int left, int right) {
        if(left > array.length || right < 0 || left > right) return null;
        if(left == right) return new TreeNode(left);
        int mIndex = maximum(array, left, right);
        TreeNode node = new TreeNode(array[mIndex]);
        node.left = construct(array, left, mIndex - 1);
        node.right = construct(array, mIndex + 1, right);
        return node;
    }
}
