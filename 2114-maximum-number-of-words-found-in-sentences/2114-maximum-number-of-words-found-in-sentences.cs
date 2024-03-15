public class Solution {
    public int MostWordsFound(string[] sentences) {
        int maxWordsNum = 1;
        
        foreach (String sentence in sentences)
        {
            int wordsNum = 1;
            
            for (int i = 0; i < sentence.Length; i++)
            {
                if (sentence[i] == ' ')
                    wordsNum++;
            }
            maxWordsNum = wordsNum > maxWordsNum ? wordsNum : maxWordsNum;
        }
        return maxWordsNum;
    }
}