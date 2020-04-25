public class Egg{
    public int getMinSteps(int eggNum, int floorNum) {
        if (eggNum < 1 || floorNum < 1) {
            return 0;
        }
        // 存储 eggNum个鸡蛋， floorNum层楼条件下的最优化尝试次数
        int[][] cache = new int[eggNum+1][floorNum+1];

        //把备忘录每个元素初始化成最大的尝试次数
        for(int i = 1; i<=eggNum; i++){
            for(int j = 0; j <= floorNum; j++) {
                cache[i][j] = j;
            }
        }

        for (int n = 2; n<eggNum; n++) {
            for(int m = 1; m<=floorNum; j++) {
                for(int k = 1; k<m; k++) {
                    cache[n][m] = Math.min(cache[n][m], 1 + Math.max(cache[n-1][k-1], cache[n][m-k]));
                }
            }
        }
        return cache[eggNum][floorNum];
    }

    public static void main(String args[]) {
        Egg e = new Egg();
        System.out.println(e.getMinSteps(5, 500));
    }
}

