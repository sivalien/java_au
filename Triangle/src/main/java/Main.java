public class Main {
    public static void main(String[] args) {
        if (args.length > 1) {
            ReadWriteUtils.write(args[1], ReadWriteUtils.read(args[0]));
        }
    }
}
