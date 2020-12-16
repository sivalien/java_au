import java.util.List;
import java.util.stream.Collectors;

public class LeetcodeSourceData {
    private final String title;
    private final String leetcodeLink;
    private final String solution;
    private String prepareData(List<String> data) {
        return data.stream()
                .skip(3)
                .filter(string -> string.length() >= 4)
                .map(string -> string.substring(4) + "\n")
                .collect(Collectors.joining());
    }
    public LeetcodeSourceData (List<String> data) {
        this.title = data.get(0).substring(data.get(0).indexOf(" ") + 1);
        this.leetcodeLink = data.get(1);
        this.solution = prepareData(data);
    }

    public String getMdTask () {
        StringBuilder res = new StringBuilder();
        res.append("\n##")
                .append(title)
                .append("\n\n")
                .append(leetcodeLink)
                .append("\n\n")
                .append("```java\n")
                .append(solution)
                .append("```");
        return res.toString();
    }
    public String getMdSubtitle() {
        StringBuilder res = new StringBuilder();
        res.append("+ [").append(title).append("](").append(leetcodeLink.split("/")[4]).append(")\n");
        return res.toString();
    }
}