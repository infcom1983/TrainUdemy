package aacdemy.devonline.java.basic.section11;

public class FindPopularWord {
    public static void main(String[] args) {

        String text = "hello java world java hello I Hello Java World java";

        String word = findMostPopularWordInText(text);

        System.out.println(word);
    }

    private static String findMostPopularWordInText(String text) {
        String[] words = findAllWordsInText(text);
        String[][] uniqueWordsAndCounts = findUniqueWordsAndCounts(words);
        return getWordWithMaxCount(uniqueWordsAndCounts);
    }

    private static String[] findAllWordsInText(String text) {
        return text.split(" ");
    }

    private static String[][] findUniqueWordsAndCounts(String[] words) {
        String[] uniqueWords = new String[words.length];
        String[] counts = new String[words.length];
        int count = 0;
        for (String word : words) {
            var lowerCaseWord = word.toLowerCase();
            if (!isAlreadyProcessed(uniqueWords, lowerCaseWord, count)) {
                int total = calculateWords(words, lowerCaseWord);
                uniqueWords[count] = lowerCaseWord;
                counts[count] = String.valueOf(total);
                count++;
            }
        }

        return convertResults(uniqueWords, counts, count);
    }

    private static boolean isAlreadyProcessed(String[] uniqueWords, String word, int count) {
        for (int i = 0; i < count; i++) {
            if (uniqueWords[i].equals(word)) {
                return true;
            }
        }
        return false;
    }

    private static int calculateWords(String[] words, String word) {
        int count = 0;
        for (String w : words) {
            if (word.equalsIgnoreCase(w)) {
                count++;
            }
        }
        return count;
    }

    private static String[][] convertResults(String[] uniqueWords, String[] counts, int count) {
        String[][] result = new String[count][2];
        for (int i = 0; i < count; i++) {
            result[i][0] = uniqueWords[i];
            result[i][1] = counts[i];
        }
        return result;
    }

    private static String getWordWithMaxCount(String[][] uniqueWordsAndCounts) {
        String word = uniqueWordsAndCounts[0][0];
        int maxCount = Integer.parseInt(uniqueWordsAndCounts[0][1]);
        for (int i = 1; i < uniqueWordsAndCounts.length; i++) {
            int currentCount = Integer.parseInt(uniqueWordsAndCounts[i][1]);
            if (currentCount > maxCount) {
                maxCount = currentCount;
                word = uniqueWordsAndCounts[i][0];
            }
        }

        return word;
    }
}
