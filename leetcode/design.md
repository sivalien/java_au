# Design

+ [Implement Queue using Stacks](implement-queue-using-stacks)

##Implement Queue using Stacks

https://leetcode.com/problems/implement-queue-using-stacks/

```java
private Stack<Integer> s1 = new Stack<>();
private Stack<Integer> s2 = new Stack<>();
public MyQueue() {}
/** Push element x to the back of queue. */
public void push(int x) {
    s1.push(x);
}
/** Removes the element from in front of queue and returns that element. */
public int pop() {
    if (s2.isEmpty()) {
        while (!s1.isEmpty())
            s2.push(s1.pop());
    }
    return s2.pop();
}
 /** Get the front element. */
public int peek() {
    int res = this.pop();
    s2.push(res);
    return res;
}
/** Returns whether the queue is empty. */
public boolean empty() {
    return s1.isEmpty() && s2.isEmpty();
}
```