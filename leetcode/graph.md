# Graph

+ [Cheapest Flights Within K Stops](cheapest-flights-within-k-stops)

##Cheapest Flights Within K Stops

https://leetcode.com/problems/cheapest-flights-within-k-stops/

```java
public int findCheapestPrice(int n, int[][] flights, int src, int dst, int k) {
    int[] d = new int[n];
    for (int i = 0; i < n; i++) {
        d[i] = Integer.MAX_VALUE;
    }
    d[src] = 0;
    for (int j = 0; j < k + 1; j++) {
        int [] curr = new int[n];
        for (int i = 0; i < n; i++) {
            curr[i] = d[i];
        }
        for (int[] flight:
             flights) {
            if (d[flight[0]] != Integer.MAX_VALUE && d[flight[0]] + flight[2] < curr[flight[1]]) {
                curr[flight[1]] = d[flight[0]] + flight[2];
            }
        }
        for (int i = 0; i < n; i++) {
            d[i] = curr[i];
        }
    }
    return (d[dst] == Integer.MAX_VALUE) ? -1 : d[dst];
}
```