# Graph

+ [Number of Islands](number-of-islands)

##Number of Islands

https://leetcode.com/problems/number-of-islands/

```java
public int numIslands(char[][] grid) {
    int count = 0;
    Stack<int[]> stack = new Stack<>();
    for (int row = 0; row < grid.length; row++) {
        for (int column = 0; column < grid[row].length; column++) {
            if (grid[row][column] == '1') {
                stack.push(new int[] {row, column});
                grid[row][column] = '+';
                while (!stack.isEmpty()) {
                    int [] current = stack.pop();
                    if (current[0] - 1 >= 0 && grid[current[0] - 1][current[1]] == '1') {
                        grid[current[0] - 1][current[1]] = '+';
                        stack.push(new int[] {current[0] - 1, current[1]});
                    }
                    if (current[0] + 1 < grid.length && grid[current[0] + 1][current[1]] == '1') {
                        grid[current[0] + 1][current[1]] = '+';
                        stack.push(new int[] {current[0] + 1, current[1]});
                    }
                    if (current[1] - 1 >= 0 && grid[current[0]][current[1] - 1] == '1') {
                        grid[current[0]][current[1] - 1] = '+';
                        stack.push(new int[] {current[0], current[1] - 1});
                    }
                    if (current[1] + 1 < grid[0].length && grid[current[0]][current[1] + 1] == '1') {
                        grid[current[0]][current[1] + 1] = '+';
                        stack.push(new int[] {current[0], current[1] + 1});
                    }
                }
                count++;
            }
        }
    }
    return count;
}
```