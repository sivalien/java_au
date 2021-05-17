# Graph

+ [Is Graph Bipartite?](is-graph-bipartite)

##Is Graph Bipartite?

https://leetcode.com/problems/is-graph-bipartite/

```java
public boolean dfs(int[][] graph, int[] color, int v) {
    for (int i = 0; i < graph[v].length; i++) {
        if (color[graph[v][i]] == 0) {
            color[graph[v][i]] = 3 - color[v];
            if (!dfs(graph, color, graph[v][i]))
                return false;
        }
        else if (color[graph[v][i]] == color[v]) {
            return false;
        }
    }
    return true;
}
public boolean isBipartite(int[][] graph) {
    int[] color = new int[graph.length];
    for (int i = 0; i < color.length; i++) {
        color[i] = 0;
    }
    for (int i = 0; i < graph.length; i++) {
        if (color[i] == 0) {
            color[i] = 1;
            if (!dfs(graph, color, i))
                return false;
        }
    }
    return true;
}
```