# Math

+ [K Closest Points to Origin](k-closest-points-to-origin)

##K Closest Points to Origin

https://leetcode.com/problems/k-closest-points-to-origin/

```java
public class PointsComparator implements Comparator<int[]> {
    @Override
    public int compare(int[] o1, int[] o2) {
        return Double.compare(Math.sqrt(o1[0] * o1[0] + o1[1] * o1[1]), Math.sqrt(o2[0] * o2[0] + o2[1] * o2[1]));
    }
}
public int[][] kClosest(int[][] points, int k) {
    Arrays.sort(points, new PointsComparator());
    int[][] res = new int[k][2];
    for (int i = 0; i < k; i++) {
        res[i] = points[i];
    }
    return res;
}
```