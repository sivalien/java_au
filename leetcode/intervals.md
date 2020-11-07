# Intervals

+ [Merge Intervals](merge-intervals)

##Merge Intervals

https://leetcode.com/problems/merge-intervals/

```java
public static int[][] mergeIntervals (int [][] intervals) {
    if (intervals.length <= 1) {
        return intervals;
    }
    Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
    LinkedList <int []> merge = new LinkedList<>();
    merge.add(intervals[0]);
    for (int i = 1; i < intervals.length; i++) {
        if (merge.getLast()[1] < intervals[i][0])
            merge.addLast(intervals[i]);
        else {
            int start = merge.getLast()[0];
            merge.removeLast();
            merge.addLast(new int[] {start, intervals[i][1]});
        }
    }
    return merge.toArray(new int[merge.size()][]);
}
```