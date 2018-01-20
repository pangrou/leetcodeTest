package test.java.main;

/**
 * Created by m2shad0w on 18/1/20.
 */
public class IsPalindromeTest {
    public boolean isPalindrome(int x) {
        if (x < 0) return false;
        else if (x < 10) return true;
        String s = String.valueOf(x);
        for (int i = 0; i < s.length()/2; i++) {
            if (s.charAt(i) != s.charAt(s.length() -1 - i)) {
                return false;
            }
        }
        return true;
    }
}
