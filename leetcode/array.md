# Array

+ [Squares of a Sorted Array](squares-of-a-sorted-array)

##Squares of a Sorted Array

https://leetcode.com/problems/squares-of-a-sorted-array/

```java
public static int[] sortedSquares(int[] A) {
    int[] result = new int[A.length];
    int right = 0, left = A.length - 1;
    for (int i = 0; i < A.length - 1; i++) {
        if (A[i] < 0 && A[i + 1] >= 0) {
            left = i;
            right = i + 1;
            break;
        }
    }
    for (int i = 0; i < A.length; i++) {
        if (left < 0 || right != A.length && Math.abs(A[right]) < Math.abs(A[left])) {
            result[i] = A[right] * A[right];
            right++;
        }
        else {
            result[i] = A[left] * A[left];
            left--;
        }
    }
    return result;
}
```