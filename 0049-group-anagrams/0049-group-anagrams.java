class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        ArrayList<List<String>> anagrams = new ArrayList<List<String>>();
        HashMap<String, List<String>> anagramGroups = new HashMap<String, List<String>>();
        
        for (String str : strs) {
            int[] isSelectedAlphabet = new int[26];
            for (char c : str.toCharArray()) {
                isSelectedAlphabet[c - 'a']++;
            }
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < 26; i++) {
                sb.append(isSelectedAlphabet[i]);
                sb.append("#");
            }
            String anagramKey = sb.toString();
            anagramGroups.putIfAbsent(anagramKey, new ArrayList<String>());
            anagramGroups.get(anagramKey).add(str);
        }
        anagrams.addAll(anagramGroups.values());
        return anagrams;
    }
}