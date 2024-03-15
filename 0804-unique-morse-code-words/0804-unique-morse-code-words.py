class Solution:
    def uniqueMorseRepresentations(self, words: List[str]) -> int:
        morseCodes = [".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
                      "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
                      "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
                      "-.--", "--.."]
        convertedSet = set()
        for i in range(len(words)):
            converted = "";
            
            for j in range(len(words[i])):
                converted += morseCodes[ord(words[i][j]) - 97]
            convertedSet.add(converted)
        return len(convertedSet)