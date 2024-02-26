package WeekSix;

public class IsPalindrome {

    public static void main(String[] args) {
        // Testing non-recursive method
        String testA = "gohangasalamiimalasagnahog";
        System.out.println("Is \"" + testA + "\" a palindrome using a non-recursive method?: " + nonRecursiveIsPalindrome(testA));

        // Testing recursive method
        String testB = "gohangasalamiimalasagnahog";
        System.out.println("Is \"" + testB + "\" a palindrome using a recursive method?: " + isPalindrome(testB));
    }

    public static boolean nonRecursiveIsPalindrome(String str) {
        String s = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        int l = 0;
        int r = s.length() - 1;

        while (l < r) {
            if (s.charAt(l) != s.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }

    public static boolean recursiveIsPalindrome(String s, int l, int r) {
        if (l >= r) {
            return true;
        }
        if (s.charAt(l) != s.charAt(r)) {
            return false;
        }
        return recursiveIsPalindrome(s, l + 1, r - 1);
    }

    public static boolean isPalindrome(String str) {
        String cs = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        return recursiveIsPalindrome(cs, 0, cs.length() - 1);
    }
}
