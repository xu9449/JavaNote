import java.util.ArrayList;
import java.util.List;

public class CombinationsOfCoins {
    public static void main(String[] args) {
        CombinationsOfCoins solu = new CombinationsOfCoins();
        int[] coins = {25, 10, 5, 1};
        int target = 50;
        List<List<Integer>> result =  solu.combinations(target, coins);
        System.out.println(result);

    }
    public List<List<Integer>> combinations(int target, int[] coins) {
        List<List<Integer>> result = new ArrayList<List<Integer>>();
        List<Integer> cur = new ArrayList<Integer>();
        findComb(target, coins, 0, cur, result);
        return result;
    }

    public void findComb(int target, int[] coins, int index, List<Integer> cur,
                                        List<List<Integer>> result){
        if(index == coins.length - 1){
            if(target%coins[coins.length - 1] == 0){
                cur.add(target/coins[coins.length - 1]);
                result.add(new ArrayList<Integer>(cur));
                cur.remove(cur.size() - 1);
            }
            return;
        }
        int max = target / coins[index];
        for(int i = 0; i <= max; i++) {
            cur.add(i);
            findComb(target - i * coins[index], coins, index + 1, cur, result);
            cur.remove(cur.size() - 1);
        }

    }

}

