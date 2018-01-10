package test.java.main;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by m2shad0w on 18/1/8.
 */
public class PalindromeStr {
    public String longestPalindrome(String s) {
        int start = 0, end = 0;
        for (int i = 0; i < s.length(); i++) {
            int len1 = isPalindStr(s, i, i);
            int len2 = isPalindStr(s, i, i + 1);
            int lenMax = Math.max(len1, len2);
            if (lenMax > end - start) {
                start = i - (lenMax - 1) / 2;
                end = i + lenMax / 2;
            }
        }
        return s.substring(start, end + 1);
    }

    public Integer isPalindStr(String s, Integer l, Integer r) {
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return r-l-1;
    }
}
