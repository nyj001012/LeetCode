class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] shuffle = new int[2 * n];
        
        for (int i = 0; i < n; i++) {
            shuffle[i * 2] = nums[i];
            shuffle[i * 2 + 1] = nums[n + i];
        }
        return shuffle;
    }
}