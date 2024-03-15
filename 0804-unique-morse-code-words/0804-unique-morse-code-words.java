class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String[] morseCodes = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
                              "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.",
                              "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-",
                              "-.--", "--.."};
        HashSet<String> convertedSet = new HashSet<String>();
        for (int i = 0; i < words.length; i++) {
            char[] charsInWord = words[i].toCharArray();
            String converted = "";
            
            for (int j = 0; j < charsInWord.length; j++) {
                converted += morseCodes[charsInWord[j] - 'a'];
            }
            convertedSet.add(converted);
        }
        return convertedSet.size();
    }
}