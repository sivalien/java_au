import java.io.*;
import java.util.*;


public class ReadWriteUtils {
    public static LeetcodeSourceData read(String fileName) {
        List<String> dataList = new ArrayList<>();
        try {
            String dataString = new Scanner(new File(fileName)).useDelimiter("\\Z").next();
            Collections.addAll(dataList, dataString.split("\n"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return new LeetcodeSourceData(dataList);
    }
    public static void write(String fileName, LeetcodeSourceData data) {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("# ");
            String allTaskTitle = new File(fileName).getName();
            writer.write(allTaskTitle.substring(0, 1).toUpperCase());
            writer.write(String.join(" ", allTaskTitle.substring(1, allTaskTitle.indexOf(".")).split("-")));
            writer.write("\n\n");
            writer.write(data.getMdSubtitle());
            writer.write(data.getMdTask());
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}