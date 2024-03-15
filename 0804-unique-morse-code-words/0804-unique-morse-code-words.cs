public class Solution {
    public int UniqueMorseRepresentations(string[] words) {
        String[] morseCodes = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
                              "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
                              "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
                              "-.--", "--.."};
        List<String> convList = new List<String>();
        for (int i = 0; i < words.Length; i++) {
            char[] charsInWord = words[i].ToCharArray();
            String converted = "";
            
            for (int j = 0; j < charsInWord.Length; j++) {
                converted += morseCodes[charsInWord[j] - 'a'];
            }
            convList.Add(converted);
        }
        convList = convList.Distinct().ToList();
        return convList.Count;
    }
}