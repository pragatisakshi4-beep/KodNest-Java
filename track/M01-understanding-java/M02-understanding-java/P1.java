// Program to find the first non-repeated character in a string
public class P1 {
    public static void main(String[] args) {
        String s = "swiss";
        boolean found = false;

        for (int i = 0; i < s.length(); i++) {
            int count = 0;

            // Count occurrences of current character s.charAt(i) in the entire string
            for (int j = 0; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    count++;
                }
            }

            // If the character occurs exactly once, it is non-repeated
            if (count == 1) {
                System.out.println("First non-repeated character: " + s.charAt(i));
                found = true;
                break; // Stop searching after finding the first non-repeated character
            }
        }

        if (!found) {
            System.out.println("No non-repeated character found in the string.");
        }
    }
}
