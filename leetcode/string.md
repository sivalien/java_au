# String

+ [Palindromic Substrings](palindromic-substrings)

##Palindromic Substrings

https://leetcode.com/problems/palindromic-substrings/

```java
static int expand(String s, int start, int end) {
    int count = 0;
    while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
        start--;
        end++;
        count++;
    }
    return count;
}
public int countSubstrings(String s) {
    if (s == null || s.length() <= 1)
        return 1;
    int res = 0;
    for (int i = 0; i < s.length(); i++) {
        res += expand(s, i, i);
        res += expand(s, i, i + 1);
    }
    return res;
}
```