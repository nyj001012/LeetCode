class Solution {
    public long getSum(int[] nums, int k) {
        long sum = 0;
        
        for (int i = 0; i < k * 2; i++)
            sum += nums[i];
        return sum;
    }
    
    public int[] getAverages(int[] nums, int k) {
        if (k == 0)
            return nums;
        
        int length = nums.length;
        int[] averages = new int[length];
        
        for (int i = 0; i < length; i++)
            averages[i] = -1;
        if (length == 0 || 2 * k + 1 > length)
            return averages;
        
        long sum = getSum(nums, k);
        
        for (int i = k; i < length - k; i++) {
            sum += nums[i + k];
            averages[i] = (int)(sum / (2 * k + 1));
            sum -= nums[i - k];
        }
        return averages;
    }
}