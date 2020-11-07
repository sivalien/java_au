# Intervals

+ [Insert Interval](insert-interval)

##Insert Interval

https://leetcode.com/problems/insert-interval/

```java
public int[][] mergeIntervals (int [][] intervals) {
    if (intervals.length <= 1) {
        return intervals;
    }
    Arrays.sort(intervals, Comparator.comparingInt(a -> a[0]));
    LinkedList <int []> merge = new LinkedList<>();
    merge.add(intervals[0]);
    for (int [] interval: intervals) {
        if (merge.getLast()[1] < interval[0])
            merge.addLast(interval);
        else if (merge.getLast()[1] < interval[1]){
            merge.getLast()[1] = interval[1];
        }
    }
    return merge.toArray(new int[merge.size()][]);
}
public int[][] insert(int [][] intervals, int[] newInterval) {
    LinkedList<int []> allIntervals = new LinkedList<>();
    Collections.addAll(allIntervals, intervals);
    allIntervals.add(newInterval);
    return mergeIntervals(allIntervals.toArray(new int[allIntervals.size()][]));
}
```