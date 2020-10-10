import java.io.*;
import java.util.*;


public class ReadWriteUtils {
    public static List<LeetcodeSourceData> read(String fileName) {
        List<List<String>> dataArray = new ArrayList<>();
        try {
            String dataString = new Scanner(new File(fileName)).useDelimiter("\\Z").next();
            for (String oneTask : dataString.split("split_word\n")) {
                dataArray.add(Arrays.asList(oneTask.split("\n")));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        List<LeetcodeSourceData> newFormatData = new ArrayList<>();
        for (List<String> task: dataArray) {
            newFormatData.add(new LeetcodeSourceData(task));
        }
        return newFormatData;
    }
    public static void write(String fileName, List<LeetcodeSourceData> data) {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write("# ");
            String allTaskTitle = new File(fileName).getName();
            writer.write(allTaskTitle.substring(0, 1).toUpperCase());
            writer.write(String.join(" ", allTaskTitle.substring(1, allTaskTitle.indexOf(".")).split("-")));
            writer.write("\n\n");
            for (LeetcodeSourceData task: data) {
                writer.write(task.getMdSubtitle());
            }
            for (LeetcodeSourceData task: data) {
                writer.write(task.getMdTask());
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}