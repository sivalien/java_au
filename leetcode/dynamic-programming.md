# Dynamic programming

+ [House Robber](house-robber)

##House Robber

https://leetcode.com/problems/house-robber/

```java
public int rob(int[] nums) {
    if (nums.length == 1)
        return nums[0];
    int[] d = new int[nums.length];
    for (int i = 0; i < d.length; i++) {
        d[i] = 0;
    }
    d[0] = nums[0];
    d[1] = Math.max(nums[0], nums[1]);
    for (int i = 2; i < nums.length; i++) {
        d[i] = Math.max(d[i - 1], d[i - 2] + nums[i]);
    }
    return d[d.length - 1];
}
```