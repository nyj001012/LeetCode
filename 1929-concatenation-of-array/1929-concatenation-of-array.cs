public class Solution {
    public int[] GetConcatenation(int[] nums) {
        int ansLen = 2 * nums.Length;
        int[] ans = new int[ansLen];
        
        for (int i = 0; i < ansLen; i++)
            ans[i] = nums[i % nums.Length];
        return ans;
    }
}