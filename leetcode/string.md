# String

+ [Group Anagrams](group-anagrams)
+ [Valid Palindrome](valid-palindrome)
+ [Longest Palindromic Substring](longest-palindromic-substring)
+ [Palindromic Substrings](palindromic-substrings)

##Group Anagrams

https://leetcode.com/problems/group-anagrams/

```java
public List<List<String>> groupAnagrams(String[] strs) {
    Map<String, List<String>> anagrams = new HashMap<>();
    for (String word: strs) {
        char[] charsOfWord = word.toCharArray();
        Arrays.sort(charsOfWord);
        String group = new String(charsOfWord);
        if (anagrams.containsKey(group)) {
            anagrams.get(group).add(word);
        } else {
            List<String> value = new ArrayList<>();
            value.add(word);
            anagrams.put(group, value);
        }
    }
    return new ArrayList(anagrams.values());
}
```
##Valid Palindrome

https://leetcode.com/problems/valid-palindrome/

```java
static boolean isPalindrome (String s) {
    if (s == null || s.isEmpty() || s.length() == 1)
        return true;
    int left = 0;
    int right = s.length() - 1;
    while (left < right) {
        if(!isAlphaNumeric(s.charAt(left))) {
            left++;
        } else if (!isAlphaNumeric(s.charAt(right))) {
            right--;
        } else if (toLowerCase(s.charAt(left)) != toLowerCase(s.charAt(right))) {
            return false;
        } else {
            right--;
            left++;
        }
    }
    return true;
}
static boolean isAlphaNumeric (char c) {
    return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z'|| c >= '0' && c <= '9';
}
static int toLowerCase (char c) {
    return (c >= 'A' && c <= 'Z') ? c - 'A' + 'a' : c;
}
```
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