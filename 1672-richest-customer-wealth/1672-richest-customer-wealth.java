class Solution {
    public int maximumWealth(int[][] accounts) {
        int max_wealth = 0;
        
        for (int i = 0; i < accounts.length; i++) {
            int wealth_sum = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                wealth_sum += accounts[i][j];
            }
            if (wealth_sum > max_wealth) {
                max_wealth = wealth_sum;
            }
        }
        return max_wealth;
    }
}