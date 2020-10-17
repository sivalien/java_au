# Linked list

+ [Palindrome Linked List](palindrome-linked-list)

##Palindrome Linked List

https://leetcode.com/problems/palindrome-linked-list/

```java
public boolean isPalindrome(ListNode head) {
    if (head == null || head.next == null)
        return true;
    ListNode right = head.next;
    ListNode left = new ListNode(head.val);
    ListNode end = head.next.next;
    while (end != null && end.next != null) {
        left = new ListNode(right.val, left);
        right = right.next;
        end = end.next.next;
    }
    if (end != null)
        right = right.next;
    while (left != null) {
        if (left.val != right.val)
            return false;
        right = right.next;
        left = left.next;
    }
    return true;
}
```