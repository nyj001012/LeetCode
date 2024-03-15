class Solution:
    def mostWordsFound(self, sentences: List[str]) -> int:
        maxWordsNum = 1
        
        for sentence in sentences:
            words = sentence.split(" ")
            if len(words) > maxWordsNum:
                maxWordsNum = len(words)
        return maxWordsNum
            