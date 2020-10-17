# Design

+ [Implement Stack using Queues](implement-stack-using-queues)

##Implement Stack using Queues

https://leetcode.com/problems/implement-stack-using-queues/

```java
private Queue<Integer> q1 = new LinkedList<>();
private int size = 0;
private void reverse(Queue<Integer> q) {
    for (int i = 0; i < size; i++) {
        q.add(q.remove());
    }
}
/** Initialize your data structure here. */
public MyStack() {}
/** Push element x onto stack. */
public void push(int x) {
    q1.add(x);
    size++;
}
/** Removes the element on top of the stack and returns that element. */
public int pop() {
    size--;
    reverse(q1);
    int res = q1.remove();
    reverse(q1);
    return res;
}
/** Get the top element. */
public int top() {
    int res = this.pop();
    size++;
    q1.add(res);
    return res;
}
/** Returns whether the stack is empty. */
public boolean empty() {
    return q1.isEmpty();
}
```