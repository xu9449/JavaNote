public class LCAI {
    public static void main(String[] args) {
        LCAI s = new LCAI();

    }
    public TreeNode lowestCommonAncestor(TreeNode root,
                                         TreeNode one, TreeNode two) {
        // Write your solution here.

        TreeNode res = helper(root, one, two);
        return res;
    }

    private TreeNode helper(TreeNode root, TreeNode one, TreeNode two){
        if(root.key != one.key && root.key != two.key || root.left == null &&
                root.right ==null){
            return null;
        }
        TreeNode left = helper(root.left, one, two);
        TreeNode right = helper(root.right, one, two);
        if(left!= null && right != null){
            return root;
        } else if(left != null){
            return left;
        } else if(right != null){
            return right;
        }
        return null;
    }
}

   class TreeNode {
    public int key;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int key) {
      this.key = key;
    }
  }
