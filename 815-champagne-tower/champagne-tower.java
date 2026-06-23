class Solution {
    public double champagneTower(int poured, int query_row, int query_glass) {

        double[][] dp = new double[101][101];
        dp[0][0] = poured;

        for (int r = 0; r < 100; r++) {
            for (int c = 0; c <= r; c++) {

                if (dp[r][c] > 1.0) {
                    double extra = (dp[r][c] - 1.0) / 2.0;

                    dp[r + 1][c] += extra;
                    dp[r + 1][c + 1] += extra;
                }
            }
        }

        return Math.min(1.0, dp[query_row][query_glass]);
    }
}