# Design

+ [Min Stack](min-stack)

##Min Stack

https://leetcode.com/problems/min-stack/

```java
private Stack<Integer> stack = new Stack<>();
private Stack<Integer> minValues = new Stack<>();
private Integer currMin;
public MinStack() {}
public void push(int x) {
    if (stack.isEmpty())
        currMin = x;
    currMin = (x < currMin) ? x : currMin;
    stack.push(x);
    minValues.push(currMin);
}
public void pop() {
    stack.pop();
    minValues.pop();
    if (!minValues.isEmpty())
        currMin = minValues.peek();
}
public int top() {
    return stack.peek();
}
public int getMin() {
    return minValues.peek();
}
```