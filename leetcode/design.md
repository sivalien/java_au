# Design

+ [LRU Cache](lru-cache)

##LRU Cache

https://leetcode.com/problems/lru-cache/

```java
int capacity;
LinkedHashMap<Integer, Integer> map;
public LRUCache(int capacity) {
    this.capacity = capacity;
    this.map = new LinkedHashMap<>(capacity) {
        protected boolean removeEldestEntry(Map.Entry eldest) {
            return size() > capacity;
        }
    };
}
public int get(int key) {
    if (!map.containsKey(key))
        return -1;
    Integer value = map.get(key);
    map.remove(key);
    map.put(key, value);
    return value;
}
public void put(int key, int value) {
    if (map.containsKey(key))
        map.remove(key);
    map.put(key, value);
}
```