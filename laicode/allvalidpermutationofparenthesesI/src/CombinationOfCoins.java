import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CombinationOfCoins {
    public static void main(String[] args) {
        CombinationOfCoins s = new CombinationOfCoins();
        int[] coins = {15, 10, 5};
        List<List<Integer>> res = new ArrayList<>();
        res = s.combinations(99, coins);
        System.out.println(res);
    }
    public List<List<Integer>> combinations(int target, int[] coins) {
        // Write your solution here
        List<List<Integer>> res = new ArrayList<>();
        //change name to cur is better.
        List<Integer> cur = new ArrayList<>();
        if(target == 0) return res;
//        for(int i = 0; i<coins.length; i ++){
//            cur.add(0);
//        }
        helper(coins, target, 0, cur, res);
        return res;
    }

//    25， 10， 5， 1
//  0 99
//  0 74
//  1 14
//  2  4
       

//    // we don't need target instead of using both remain and target
//    private void helper(int[] coins, int target, int index, List<Integer> cur, List<List<Integer>> res){
//        if(target == 0 && index <= coins.length - 1){
//            res.add(cur);
//            return;
//        } else if( target < 0){
//            return;
//        }
//        for(int i = 0; i < coins.length; i++){
//            int tem = cur.get(i);
//            cur.set(i, ++tem);
//            helper(coins, target - coins[i], index + 1, cur, res);
//            cur.set(i, --tem);
//        }
//    }













    private void helper(int[] coins, int target, int index, List<Integer> cur, List<List<Integer>> res){
        if(index == coins.length - 1){
            if(target % coins[index] == 0){
                cur.add(target / coins[index]);
                //why can not add cur directly
                res.add(new ArrayList<>(cur));
                cur.remove(index);
            }
            return;
        }
        int max = target / coins[index];
        for(int i = 0; i<= max; i++){
            cur.add(i);
            helper(coins, target - i*coins[index], index + 1, cur, res);
            cur.remove(cur.size() - 1);
        }
    }
}
