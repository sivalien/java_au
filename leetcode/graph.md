# Graph

+ [Course Schedule](course-schedule)

##Course Schedule

https://leetcode.com/problems/course-schedule/

```java
List<List<Integer>> list = new ArrayList<>();
int[] visit;
public boolean canFinish(int numCourses, int[][] prerequisites) {
    visit = new int[numCourses];
    for (int i = 0; i < numCourses; i++) {
        visit[i] = 0;
    }
    for (int i = 0; i < numCourses; i++) {
        list.add(new ArrayList<>());
    }
    for (int[] edge : prerequisites) {
        list.get(edge[1]).add(edge[0]);
    }
    for (int i = 0; i < numCourses; i++) {
        if (visit[i] == 0) {
            if (!dfs(i))
                return false;
        }
    }
    return true;
}
public boolean dfs(int elem) {
    if (visit[elem] == 1) {
        return false;
    }
    if (visit[elem] == 0) {
        visit[elem] = 1;
        if (!list.get(elem).isEmpty()) {
            for (int neighbour : list.get(elem)) {
                if (!dfs(neighbour))
                    return false;
            }
        }
        visit[elem] = -1;
    }
    return true;
}
```