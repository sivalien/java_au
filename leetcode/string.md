# String

+ [Valid Palindrome](valid-palindrome)

##Valid Palindrome

https://leetcode.com/problems/valid-palindrome/

```java
static boolean isAlphaNumeric (char c) {
    return c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z'|| c >= '0' && c <= '9';
}

static int toLowerCase (char c) {
    return (c >= 'A' && c <= 'Z') ? c - 'A' + 'a' : c;
}

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
```