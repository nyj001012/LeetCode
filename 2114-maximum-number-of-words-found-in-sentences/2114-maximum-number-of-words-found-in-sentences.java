class Solution {
    public int mostWordsFound(String[] sentences) {
        int maxWordsNum = 0;
        for (String sentence : sentences) {
            String[] split = sentence.split(" ");
            int wordsNum = split.length;
            
            if (wordsNum > maxWordsNum)
                maxWordsNum = wordsNum;
        }
        return maxWordsNum;
    }
}