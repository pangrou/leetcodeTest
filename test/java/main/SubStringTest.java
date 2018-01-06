package test.java.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by m2shad0w on 18/1/5.
 */
public class SubStringTest {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0, j = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i))) {
                j = Math.max(map.get(s.charAt(i)), j);
            }
            ans = Math.max(ans, i - j + 1);
            map.put(s.charAt(i), i + 1);
        }
        return ans;
    }
}
