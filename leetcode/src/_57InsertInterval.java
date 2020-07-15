public class _57InsertInterval {
    public static void main(String[] args) {
        _57InsertInterval s = new _57InsertInterval();
        int[][] input = {{1,2},{3,5},{6,7},{8,10}, {12, 16}};
        int[] target = {4, 8};
        int[][] res = s.insert(input, target);
        System.out.println(res);
    }
        public int[][] insert(int[][] intervals, int[] newInterval) {
            int nStart = 0;
            int nEnd = 0;
            int dStart = -1;
            int dEnd = -1;
            int i = 0;
            while(i < intervals.length && intervals[i][1] < newInterval[0]){
                i++;
            }
            if(i == intervals.length){
                int[][] res = new int[intervals.length + 1][2];
                for(int m = 0; m < intervals.length; m++){
                    for(int n = 0; n < intervals[0].length; n++){
                        res[m][n] = intervals[m][n];
                    }
                }
                res[intervals.length][0] = newInterval[0];
                res[intervals.length][1] = newInterval[1];
            }
            nStart = Math.min(intervals[i][0], newInterval[0]);
            dStart = i;
            while(i < intervals.length && intervals[i][0] <= newInterval[1]){
                nEnd = Math.max(newInterval[1], intervals[i][1]);
                i++;
            }
            if(nEnd == newInterval[1]){
                dEnd = i - 1;
            }

            if(dEnd < dStart){
                int[][] res = new int[intervals.length + 1][2];
                for(int m = 0; m <= dEnd; m++){
                    for(int n = 0; n < 2; n++){
                        res[m][n] = intervals[m][n];
                    }
                }
                res[dEnd+1][0] = newInterval[0];
                res[dEnd+1][1] = newInterval[1];
                for(int m = dEnd+2; m < res.length; m++){
                    for(int n = 0; n < 2; n++){
                        res[m][n] = intervals[m][n];
                    }
                }
                return res;
            } else if(dEnd == dStart && intervals[dEnd][1] >= newInterval[1]){
                return intervals;
            } else {
                int[][] res = new int[intervals.length - (dEnd - dStart)][2];
                for(int m = 0; m <= dStart - 1; m++){
                    for(int n = 0; n < 2; n++){
                        res[m][n] = intervals[m][n];
                    }
                }
                res[dStart][0] = nStart;
                res[dStart][1] = nEnd;
                for(int m = dStart + 1; m < res.length; m++){
                    for(int n = 0; n < 2; n++){
                        res[m][n] = intervals[m][n];
                    }
                }
                return res;
            }
        }

}
