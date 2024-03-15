class Solution {
    public int[] getConcatenation(int[] nums) {
        int ansLen = 2 * nums.length;
        int[] ans = new int[ansLen];
        
        for (int i = 0; i < ansLen; i++)
            ans[i] = nums[i % nums.length];
        return ans;
    }
}