package BFS;

import Support.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class bfs {
      public class TreeNode {
          public int key;
          public TreeNode left;
          public TreeNode right;

          public TreeNode(int key) {
              this.key = key;
          }
      } 

    public List<List<Integer>> layerByLayer(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();
        if(root == null) {
            return result;
        }
        queue.offer(root);

        while(!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> add = new ArrayList<Integer>();
            for (int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                add.add(curr.key);
            if (curr.left != null) {
                queue.offer(curr.left);
            }
            if (curr.right != null) {
                queue.offer(curr.right);
            }
            }
            result.add(add);
        }
        return result;
    }

}
