import java.io.File;
import java.util.List;

public class Main{
    private static final String filename = "source_leetcode_data.txt";
    public static void main(String[] args) {
        String workingDirectory = System.getProperty("user.dir");
        List<LeetcodeSourceData> data = ReadWriteUtils.read(workingDirectory + File.separator + filename);
        ReadWriteUtils.write("intervals.md", data);
    }
}
