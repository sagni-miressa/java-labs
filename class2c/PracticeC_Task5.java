package class2c;

class StringUtil {
    // Private constructor prevents instantiation
    private StringUtil() {
        throw new UnsupportedOperationException("Utility class cannot be instantiated.");
    }

    public static String reverse(String str) {
        if (str == null) return null;
        return new StringBuilder(str).reverse().toString();
    }

    public static int countVowels(String str) {
        if (str == null) return 0;
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public static boolean isPalindrome(String str) {
        if (str == null) return false;
        String clean = str.replaceAll("\\s+", "").toLowerCase();
        return clean.equals(reverse(clean));
    }
}

public class PracticeC_Task5 {
    public static void main(String[] args) {
        String test = "racecar";

        System.out.println("Reversed 'Hello': " + StringUtil.reverse("Hello"));
        System.out.println("Vowels in 'Java': " + StringUtil.countVowels("Java"));
        System.out.println("Is 'racecar' a palindrome? " + StringUtil.isPalindrome(test));

        // StringUtil util = new StringUtil(); // ERROR: StringUtil() has private access in StringUtil
    }
}