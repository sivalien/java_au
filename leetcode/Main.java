import java.io.File;

public class Main{
    private static final String filename = "source_leetcode_data.txt";
    public static void main(String[] args) {
        String workingDirectory = System.getProperty("user.dir");
        LeetcodeSourceData data = ReadWriteUtils.read(workingDirectory + File.separator + filename);
        ReadWriteUtils.write(args[0], data);
    }
}