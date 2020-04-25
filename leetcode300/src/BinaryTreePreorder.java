//import javax.swing.tree.TreeNode;
//import java.util.ArrayList;
//import java.util.List;
//
//public class TreeNode {
//      int val;
//      TreeNode left;
//      TreeNode right;
//     TreeNode(int x) { val = x; }
// }
//
//
//public class BinaryTreePreorder {
//    public List<Integer> preorderTraversal(TreeNode root) {
//        List<Integer> result = new ArrayList<Integer>();
//        if(root == null) return result;
//        result.add(root.val);
//        if(root.left != null) {
//            result.addAll(preorderTraversal(root.left));
//        }
//        if (root.right != null) {
//            result.addAll(preorderTraversal(root.right));
//        }
//        return result;
//
//    }
//}
