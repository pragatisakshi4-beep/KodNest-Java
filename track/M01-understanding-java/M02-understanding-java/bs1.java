
import java.util.Arrays;
import java.util.Scanner;

public class bs1 {

    public static boolean closeStrings(String word1, String word2) {
        // Condition 0: Strings of different lengths can never be close
        if (word1.length() != word2.length()) {
            return false;
        }

        int[] freq1 = new int[26];
        int[] freq2 = new int[26];

        // Step 1: Count character frequencies for both strings
        for (int i = 0; i < word1.length(); i++) {
            freq1[word1.charAt(i) - 'a']++;
            freq2[word2.charAt(i) - 'a']++;
        }

        // Step 2: Ensure both strings contain the exact same set of unique characters
        for (int i = 0; i < 26; i++) {
            if ((freq1[i] == 0 && freq2[i] > 0) || (freq1[i] > 0 && freq2[i] == 0)) {
                return false;
            }
        }

        // Step 3: Check if character frequency distributions match when sorted
        Arrays.sort(freq1);
        Arrays.sort(freq2);

        for (int i = 0; i < 26; i++) {
            if (freq1[i] != freq2[i]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNext()) return;
        String word1 = sc.next();
        String word2 = sc.next();

        // Outputs true or false directly
        System.out.println(closeStrings(word1, word2));
        sc.close();
    }
}

