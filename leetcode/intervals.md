# Intervals

+ [Merge Intervals](merge-intervals)

##Merge Intervals

https://leetcode.com/problems/merge-intervals/

```java
public static int[][] merge (int [][] intervals) {
    if (intervals.length <= 1)
        return intervals;
    Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
    LinkedList <int []> merged = new LinkedList<>();
    merged.add(intervals[0]);
    for (int i = 1; i < intervals.length; i++) {
        if (merged.getLast()[1] < intervals[i][0])
            merged.addLast(intervals[i]);
        else {
            int start = merged.getLast()[0];
            int end = (intervals[i][1] > merged.getLast()[1]) ? intervals[i][1] : merged.getLast()[1];
            merged.removeLast();
            merged.addLast(new int[] {start, end});
        }
    }
    return merged.toArray(new int[merged.size()][]);
}
```