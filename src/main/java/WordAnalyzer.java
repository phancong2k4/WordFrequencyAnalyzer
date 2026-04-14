public class WordAnalyzer {
    public int countTargetWord(String[] words, String targetWord) {
        if (words == null || targetWord == null) {
            return 0;
        }

        int count = 0;
        for (String word : words) {
            if (word != null && word.equalsIgnoreCase(targetWord)) {
                count++;
            }
        }
        return count;
    }
}