# Intervals

+ [Non-overlapping Intervals](non-overlapping-intervals)

##Non-overlapping Intervals

https://leetcode.com/problems/non-overlapping-intervals/

```java
public static int eraseOverlapIntervals (int [][] intervals) {
    Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
    int[] prev = new int[0];
    int res = 0;
    for (int [] interval: intervals) {
        if (prev.length != 0 && prev[1] > interval[0]) {
            res++;
            prev = interval[1] > prev[1] ? prev : interval;
        } else {
            prev = interval;
        }
    }
    return res;
}
```