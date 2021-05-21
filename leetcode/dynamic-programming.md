# Dynamic programming

+ [House Robber II](house-robber-ii)

##House Robber II

https://leetcode.com/problems/house-robber-ii/

```java
public int rob1(int[] nums, int start, int end) {
    if (start == end)
        return nums[start];
    int[] d = new int[end - start + 1];
    for (int i = 0; i < d.length; i++) {
        d[i] = 0;
    }
    d[0] = nums[start];
    d[1] = Math.max(nums[start], nums[start + 1]);
    for (int i = 2; i < end - start + 1; i++) {
        d[i] = Math.max(d[i - 1], d[i - 2] + nums[i + start]);
    }
    return d[d.length - 1];
}
public int rob(int[] nums) {
    if (nums.length == 1) {
        return nums[0];
    }
    return Math.max(rob1(nums, 0, nums.length - 2), rob1(nums, 1, nums.length - 1));
}
```