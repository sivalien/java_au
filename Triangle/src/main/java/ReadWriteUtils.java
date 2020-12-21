import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ReadWriteUtils {
    public static String read(String fileName) {
        Triangle triangle = new Triangle();
        try {
            triangle = Files.lines(Paths.get(fileName))
                    .filter(string -> string.matches("-?[0-9]+ -?[0-9]+ -?[0-9]+ -?[0-9]+ -?[0-9]+ -?[0-9]"))
                    .map(string -> Arrays.asList(string.split(" ")))
                    .filter(x -> x.size() == 6)
                    .map(x -> x.stream().map(Integer::parseInt).collect(Collectors.toList()))
                    .map(x -> new Triangle(new Point(x.get(0), x.get(1)), new Point(x.get(2), x.get(3)), new Point(x.get(4), x.get(5))))
                    .filter(Triangle::isIsosceles)
                    .filter(x -> Triangle.getA() != null && Triangle.getB() != null && Triangle.getC() != null)
                    .max(Comparator.comparingDouble(Triangle::getSquare)).orElse(null);

        } catch (IOException e) {
            e.printStackTrace();
        }
        return triangle == null ? "" : triangle.toString();
    }

    public static void write (String fileName, String triangle) {
        try {
            FileWriter writer = new FileWriter(fileName);
            writer.write(triangle);
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
