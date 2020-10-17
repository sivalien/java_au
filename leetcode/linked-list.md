# Linked list

+ [Sort List](sort-list)

##Sort List

https://leetcode.com/problems/sort-list/

```java
static ListNode sortList (ListNode head) {
    if (head == null || head.next == null)
        return head;
    ListNode right = head.next;
   ListNode left = new ListNode(head.val);
   ListNode end = head.next.next;
   while (end != null && end.next != null) {
       left = new ListNode(right.val, left);
       right = right.next;
       end = end.next.next;
   }
   return merge(sortList(left), sortList(right));
}
static ListNode merge(ListNode head1, ListNode head2) {
    if (head1 == null)
        return head2;
    if (head2 == null)
        return head1;
    if (head1.val <= head2.val)
        return new ListNode(head1.val, merge(head1.next, head2));
    else
        return new ListNode(head2.val, merge(head1, head2.next));
}
```