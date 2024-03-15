public class Solution {
    public int FinalValueAfterOperations(string[] operations) {
        int x = 0;
        
        foreach (string op in operations)
        {
            switch (op)
            {
                case "X++":
                case "++X":
                    ++x;
                    break;
                default:
                    --x;
                    break;
            }
        }
        return x;
    }
}