public class PangramChecker {
    public static void main(String[] args) {
        String input = "The five boxing wizards jump quickly"; 

        boolean isPangram = isPangram(input);
        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String input) {
        input = input.toLowerCase(); // Convert the input to lowercase for case insensitivity
        boolean[] alphabet = new boolean[26]; // Array to track the presence of each letter

        for (char c : input.toCharArray()) {
            if (c >= 'a' && c <= 'z') {
                alphabet[c - 'a'] = true;
            }
        }

        for (boolean present : alphabet) {
            if (!present) {
                return false; // If any letter is missing, it's not a pangram
            }
        }

        return true; // All letters are present, it's a pangram
    }
}
