class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        
        for (int i = 0; i < operations.length; i++) {
            switch (operations[i]) {
                case "X++":
                case "++X":
                    x += 1;
                    break;
                default:
                    x -= 1;
                    break;
            }
        }
        return x;
    }
}