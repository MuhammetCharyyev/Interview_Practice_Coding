package String;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstring {

    public static void main(String[] args) {

        String str = "abcdab";//must be 'abcd' the longest substring without duplicates

        longestSubstr(str);

    }

    private static String longestSubstr(String str) {

        Set<Character> hs = new HashSet<>();

        String longestOverall = "";
        String longestTillNow = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (hs.contains(ch)) {
                longestTillNow = "";
                hs.clear();
            }
            hs.add(ch);
            longestTillNow += ch;

            if (longestTillNow.length() > longestOverall.length()) {
                longestTillNow = longestOverall;
            }
        }

        return longestOverall;

    }

}
