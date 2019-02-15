package solution;

/**
 * @author zhouzhankun
 * @time 19/2/14 16:39
 **/

/**

        Example 1:
        Input: s = "ab", t = "acb"
        Output: true
        Explanation: We can insert 'c' into s to get t.
        Example 2:

        Input: s = "cab", t = "ad"
        Output: false
        Explanation: We cannot get t from s by only one step.
        Example 3:

        Input: s = "1203", t = "1213"
        Output: true
        Explanation: We can replace '0' with '1' to get t

**/

public class OneEditDistance {

    public boolean isOneEditDistance(String s, String t) {

        if (s == null || s.length() <= 0) {
            return false;
        }

        if (t == null || t.length() <= 0) {
            return false;
        }

        if (Math.abs(s.length() - t.length()) > 1) {
            return false;
        }

        if (s.equals(t)) {
            return false;
        }

        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();

        int minLength = Math.min(sc.length, tc.length);
        for (int i = 0; i < minLength; i++) {
            if (sc[i] != tc[i]) {
                if (sc.length == tc.length) {
                    return s.substring(i + 1) == t.substring(i + 1);
                } else if (s.length() > t.length()) {
                    return s.substring(i + 1).equals(t.substring(i));
                } else {
                    return t.substring(i + 1).equals(s.substring(i));
                }
            }
        }

        return Math.max(s.length(), t.length()) == Math.min(s.length(), t.length()) + 1;
    }
}
