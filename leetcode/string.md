# String

+ [Group Anagrams](group-anagrams)

##Group Anagrams

https://leetcode.com/problems/group-anagrams/

```java
public List<List<String>> groupAnagrams(String[] words) {
    Map<String, List<String>> anagrams = new HashMap<>();
    for (String word: words) {
        char[] chars = word.toCharArray();
        Arrays.sort(chars);
        String group = new String(chars);
        if (anagrams.containsKey(group)) {
            anagrams.get(group).add(word);
        } else {
            List<String> value = new ArrayList<>();
            value.add(word);
            anagrams.put(group, value);
        }
    }
    return new ArrayList(anagrams.values());
}
```