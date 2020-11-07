# String

+ [Longest Palindromic Substring](longest-palindromic-substring)

##Longest Palindromic Substring

https://leetcode.com/problems/longest-palindromic-substring/

```java
public String longestPalindrome(String s) {
    if (s == null || s.length() <= 1)
        return s;
    String ans = new String();
    for (int i = 0; i < s.length(); i++) {
       String odd = new String (findPalindrom(s, i, i));
       String even = new String (findPalindrom(s, i, i + 1));
       if (ans.length() < odd.length())
            ans = odd;
       if (ans.length() < even.length())
           ans = even;
    }
    return ans;
}
public String findPalindrom (String s, int start, int end) {
    while (start >= 0 && end < s.length() && s.charAt(start) == s.charAt(end)) {
        start--;
        end++;
    }
    return s.substring(start + 1, end);
}
```