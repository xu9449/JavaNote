import java.util.ArrayList;
import java.util.List;

public class CombinationsOfCoins {
    public static void main(String[] args) {
        CombinationsOfCoins solu = new CombinationsOfCoins();
        int[] coins = {2, 3, 6, 7};
        int target = 7;
        List<List<Integer>> result =  solu.combinationSum(coins, target);
        System.out.println(result);

    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        int[] level = new int[candidates.length];
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> cur = new ArrayList<Integer>();
        combine(candidates, cur, 0, target, result);
        return result;
    }

    public void combine(int[] candidates, List<Integer> cur, int index, int left, List<List<Integer>> result){
        if(index == candidates.length - 1){
            if(left%candidates[index] == 0){
                cur.add(left/candidates[index]);
                List<Integer> list = new ArrayList<>();
                for(int i = 0; i < cur.size() ; i++) {
                    if(cur.get(i) != 0){
                        for(int j = 1; j <= cur.get(i); j++){
                            list.add(candidates[i]);
                        }
                    }
                }
                result.add(new ArrayList<Integer>(list));
                cur.remove(cur.size() - 1);
            }
            return;
        }
        int max = left / candidates[index];
        for(int i = 0; i <= max; i++) {
            cur.add(i);
            combine(candidates, cur, index + 1, left - i * candidates[index], result);
            cur.remove(cur.size() - 1);
        }
    }

}

