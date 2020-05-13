package LeetCode_Easy;

import java.util.HashMap;

public class LeetCode_748_Shortest_Completing_Word {
    public static void main(String[] args) {
        //String licensePlate = "1s3 PSt";
        //String[] words = {"step", "steps", "stripe", "stepple"};

        String licensePlate = "Ah71752";
        String[] words = {"suggest", "letter", "of", "husband", "easy", "education", "drug", "prevent", "writer", "old"};
        System.out.println(shortestCompletingWord(licensePlate, words));
    }

    public static String shortestCompletingWord(String licensePlate, String[] words) {

        String licenseChars = filteredLicensePlate(licensePlate);
        System.out.println(licenseChars);

        HashMap<Character, Integer> licenseHash = new HashMap();
        //int[] licensePlateIndex = new int[26];
        //wordToIndexArray(licenseChars, licensePlateIndex);
        wordToIndexHashMap(licenseChars, licenseHash);
        //System.out.println(Arrays.toString(licensePlateIndex));
        System.out.println(licenseHash);

        int shortestWord = Integer.MAX_VALUE;
        int matchingLetterCount = 0;
        String answer = "";
        for (String word : words) {
            HashMap<Character, Integer> targetHash = new HashMap();
            //int[] targetIndex = new int[26];
            int tmpMatchCounter = 0;
            //wordToIndexArray(word, targetIndex);
            wordToIndexHashMap(word, targetHash);
            //System.out.println(Arrays.toString(targetIndex));
            System.out.println(targetHash);
            /*for (int i = 0; i < licensePlateIndex.length; i++) {
                tmpMatchCounter += matchingLetters(licensePlateIndex[i], targetIndex[i]);
            }*/

            for (Character key : licenseHash.keySet()) {
                tmpMatchCounter += matchingLetters(licenseHash.getOrDefault(key, 0), targetHash.getOrDefault(key, 0));
            }

            if (tmpMatchCounter > matchingLetterCount) {
                matchingLetterCount = tmpMatchCounter;
                answer = word;
                shortestWord = word.length();
            } else if (word.length() < shortestWord && tmpMatchCounter == matchingLetterCount) {
                answer = word;
                shortestWord = word.length();
            }
        }
        System.out.println(answer);

        return answer;
    }

    private static void wordToIndexHashMap(String word, HashMap<Character, Integer> targetHash) {
        for (int i = 0; i < word.length(); i++) {
            targetHash.put((char) (word.charAt(i) - 'a'), targetHash.getOrDefault((char) (word.charAt(i) - 'a'), 0) + 1);
        }
    }


    private static int matchingLetters(int licensePlateIndex, int targetIndex) {
        int count = 0;

        if (licensePlateIndex == 0 || targetIndex == 0) {
            return 0;
        } else if (targetIndex > 0 && licensePlateIndex > 0) {
            while (licensePlateIndex > 0 && targetIndex > 0) {
                count++;
                licensePlateIndex--;
                targetIndex--;
            }
        }

        return count;
    }

    public static int[] wordToIndexArray(String word, int[] targetIndex) {
        for (int i = 0; i < word.length(); i++) {
            targetIndex[word.charAt(i) - 'a']++;
        }
        return targetIndex;
    }

    public static String filteredLicensePlate(String plate) {
        StringBuilder tmpStr = new StringBuilder();
        char[] c = plate.toLowerCase().toCharArray();
        for (int i = 0; i < plate.length(); i++) {
            if (c[i] < 'a') {
                continue;
            }
            tmpStr.append(c[i]);
        }
        return tmpStr.toString();
    }
}
