# Design

+ [Design Twitter](design-twitter)

##Design Twitter

https://leetcode.com/problems/design-twitter/

```java
private Map<Integer, Set<Integer>> usersFollowers;
private int time = 0;
private  Map<Integer, List<Twit>> userTweets;
class Twit {
    private int time;
    private int id;
    Twit(int id, int time) {
        this.id = id;
        this.time = time;
    }
}
/** Initialize your data structure here. */
public Twitter() {
    usersFollowers = new HashMap<>();
    userTweets = new HashMap<>();
}
private void addUser(int userId) {
    usersFollowers.put(userId, new HashSet<>());
    usersFollowers.get(userId).add(userId);
    userTweets.put(userId, new ArrayList<>());
}
/** Compose a new tweet. */
public void postTweet(int userId, int tweetId) {
   if (!usersFollowers.containsKey(userId)) {
        addUser(userId);
    }
    userTweets.get(userId).add(new Twit(tweetId, time++));
}
/** Retrieve the 10 most recent tweet ids in the user's news feed. Each item in the news feed must be posted by users who the user followed or by the user herself. Tweets must be ordered from most recent to least recent. */
public List<Integer> getNewsFeed(int userId) {
    PriorityQueue<Twit> queue = new PriorityQueue<>(Comparator.comparingInt(twit -> -twit.time));
    if (usersFollowers.containsKey(userId)) {
        for (int followee : usersFollowers.get(userId)) {
            userTweets.get(followee).forEach(queue::offer);
        }
    }
    List<Integer> res = new ArrayList<>();
    for (int i = 0; i < 10 && !queue.isEmpty(); i++) {
        res.add(queue.poll().id);
    }
    return res;
}
/** Follower follows a followee. If the operation is invalid, it should be a no-op. */
public void follow(int followerId, int followeeId) {
    if (!usersFollowers.containsKey(followeeId)) {
        addUser(followeeId);
    }
    if (!usersFollowers.containsKey(followerId)) {
        addUser(followerId);
    }
    usersFollowers.get(followerId).add(followeeId);
}
/** Follower unfollows a followee. If the operation is invalid, it should be a no-op. */
public void unfollow(int followerId, int followeeId) {
    usersFollowers.get(followerId).remove(followeeId);
}
```