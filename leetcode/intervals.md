# Intervals

+ [Non-overlapping Intervals](non-overlapping-intervals)
+ [Merge Intervals](merge-intervals)
+ [Insert Interval](insert-interval)

##Non-overlapping Intervals

https://leetcode.com/problems/non-overlapping-intervals/

```java
private static class IntervalComparator implements Comparator<int []> {
    public int compare(int a[], int b[]) {
        return (a[0] < b[0]) ? -1 : ((a == b) ? 0 : 1);
    }
}
public static int eraseOverlapIntervals (int [][] intervals) {
(intervals.length <= 1) {
        return 0;
    }
    Collections.sort(Arrays.asList(intervals), new IntervalComparator());
    int[] prev = intervals[0];
    int res = 0;
    for (int [] interval: intervals) {
                if (prev[1] > interval[0]) {
                    res++;
                    prev = (interval[1] > prev[1]) ? prev : interval;
                } else
                    prev = interval;
            }
    return res;
}
```
##Merge Intervals

https://leetcode.com/problems/merge-intervals/

```java
private class IntervalComparator implements Comparator<int []> {
    public int compare(int a[], int b[]) {
        return (a[0] < b[0]) ? -1 : ((a == b) ? 0 : 1);
    }
}
public int[][] mergeIntervals (int [][] intervals) {
    if (intervals.length <= 1) {
        return intervals;
    }
    Collections.sort(Arrays.asList(intervals), new IntervalComparator());
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
```
##Insert Interval

https://leetcode.com/problems/insert-interval/

```java
private class IntervalComparator implements Comparator<int []> {
    public int compare(int a[], int b[]) {
        return (a[0] < b[0]) ? -1 : ((a == b) ? 0 : 1);
    }
}
public int[][] mergeIntervals (int [][] intervals) {
    if (intervals.length <= 1) {
        return intervals;
    }
    Collections.sort(Arrays.asList(intervals), new IntervalComparator());
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