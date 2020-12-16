# Graph

+ [Course Schedule II](course-schedule-ii)

##Course Schedule II

https://leetcode.com/problems/course-schedule-ii/submissions/

```java
List<List<Integer>> list = new ArrayList<>();
int[] ans, visit;
int count;
public int[] findOrder(int numCourses, int[][] prerequisites) {
    if (numCourses == 1) {
        return new int[]{0};
    }
    count = numCourses - 1;
    ans = new int[numCourses];
    for (int i = 0; i < numCourses; i++) {
        list.add(new ArrayList<>());
    }
    for (int[] edge : prerequisites) {
        list.get(edge[1]).add(edge[0]);
    }
    visit = new int[numCourses];
    for (int i = 0; i < numCourses; i++) {
        visit[i] = 0;
    }
    for (int elem = 0; elem < numCourses; elem++) {
        if (visit[elem] == 0) {
            if (!dfs(elem))
                return new int[]{};
        }
    }
    if (count != -1) {
        for (int i = 0; i < numCourses; i++) {
            int finalI = i;
            if (Arrays.stream(ans).noneMatch(x -> (finalI == x))) {
                ans[count--] = i;
            }
        }
    }
    return ans;
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
        ans[count--] = elem;
    }
    return true;
}
```