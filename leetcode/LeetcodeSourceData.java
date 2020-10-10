import java.util.List;

public class LeetcodeSourceData {
    private final String title;
    private final String leetcodeLink;
    private final String solution;
    private String prepareData(List<String> data) {
        StringBuilder res = new StringBuilder();
        for (int i = 3; i < data.size() - 1; i++) {
            res.append(data.get(i).substring(4));
            res.append('\n');
        }
        return res.toString();
    }
    public LeetcodeSourceData (List<String> data) {
        this.title = data.get(0).substring(data.get(0).indexOf(" ") + 1);
        this.leetcodeLink = data.get(1);
        this.solution = prepareData(data);
    }
    public String getMdTask () {
        StringBuilder res = new StringBuilder();
        res.append("\n##").append(title);
        res.append("\n\n").append(leetcodeLink);
        res.append("\n\n").append("```java\n").append(solution).append("```");
        return res.toString();
    }
    public String getMdSubtitle() {
        StringBuilder res = new StringBuilder();
        res.append("+ [").append(title).append("](");
        res.append(leetcodeLink.split("/")[4]).append(")\n");
        return res.toString();
    }
}
