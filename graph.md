# Graph

+ [Shortest Path in Binary Matrix](shortest-path-in-binary-matrix)

##Shortest Path in Binary Matrix

https://leetcode.com/problems/shortest-path-in-binary-matrix/

```java
public int shortestPathBinaryMatrix(int[][] grid) {
    if (grid[0][0] == 1) {
        return -1;
    }
    boolean[][] visited = new boolean[grid.length][grid.length];
    int[][] d = new int[grid.length][grid.length];
    for (int i = 0; i < grid.length; i++) {
        for (int j = 0; j < grid.length; j++) {
            visited[i][j] = false;
            d[i][j] = -1;
        }
    }
    Queue<int[]> queue = new ArrayDeque<>();
    queue.offer(new int[] {0, 0});
    visited[0][0] = true;
    d[0][0] = 1;
    while (!queue.isEmpty()) {
        int[] v = queue.poll();
        if (v[0] - 1 >= 0 && v[1] - 1 >= 0 && grid[v[0] - 1][v[1] - 1] == 0) {
            grid[v[0] - 1][v[1] - 1] = 1;
            queue.offer(new int[] {v[0] - 1, v[1] - 1});
            d[v[0] - 1][v[1] - 1] = d[v[0]][v[1]] + 1;
        }
        if (v[0] - 1 >= 0 && v[1] + 1 < grid.length && grid[v[0] - 1][v[1] + 1] == 0) {
            grid[v[0] - 1][v[1] + 1] = 1;
            queue.offer(new int[] {v[0] - 1, v[1] + 1});
            d[v[0] - 1][v[1] + 1] = d[v[0]][v[1]] + 1;
        }
        if (v[0] + 1 < grid.length && v[1] + 1 < grid.length && grid[v[0] + 1][v[1] + 1] == 0) {
            grid[v[0] + 1][v[1] + 1] = 1;
            queue.offer(new int[] {v[0] + 1, v[1] + 1});
            d[v[0] + 1][v[1] + 1] = d[v[0]][v[1]] + 1;
        }
        if (v[0] + 1 < grid.length && v[1] - 1 >= 0 && grid[v[0] + 1][v[1] - 1] == 0) {
            grid[v[0] + 1][v[1] - 1] = 1;
            queue.offer(new int[] {v[0] + 1, v[1] - 1});
            d[v[0] + 1][v[1] - 1] = d[v[0]][v[1]] + 1;
        }
        if (v[0] + 1 < grid.length && grid[v[0] + 1][v[1]] == 0) {
            grid[v[0] + 1][v[1]] = 1;
            queue.offer(new int[] {v[0] + 1, v[1]});
            d[v[0] + 1][v[1]] = d[v[0]][v[1]] + 1;
        }
        if ( v[1] + 1 < grid.length && grid[v[0]][v[1] + 1] == 0) {
            grid[v[0]][v[1] + 1] = 1;
            queue.offer(new int[] {v[0], v[1] + 1});
            d[v[0]][v[1] + 1] = d[v[0]][v[1]] + 1;
        }
        if (v[0] - 1 >= 0 && grid[v[0] - 1][v[1]] == 0) {
            grid[v[0] - 1][v[1]] = 1;
            queue.offer(new int[] {v[0] - 1, v[1]});
            d[v[0] - 1][v[1]] = d[v[0]][v[1]] + 1;
        }
        if (v[1] - 1 >= 0 && grid[v[0]][v[1] - 1] == 0) {
            grid[v[0]][v[1] - 1] = 1;
            queue.offer(new int[] {v[0], v[1] - 1});
            d[v[0]][v[1] - 1] = d[v[0]][v[1]] + 1;
        }
    }
    return d[grid.length - 1][grid.length - 1];
}
```