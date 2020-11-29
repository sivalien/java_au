import java.util.Iterator;

public class Array3D implements Iterable<Integer>{
    private int[][][] array;

    public Array3D(int[][][] array) {
        this.array = array;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int x = 0;
            int y = 0;
            int z = 0;
            @Override
            public boolean hasNext() {
                return x < array.length;
            }

            @Override
            public Integer next() {
                if (!hasNext()) throw new UnsupportedOperationException();
                int val = array[x][y][z];
                if (y == array[x].length - 1 && z == array[x][y].length - 1) {
                    y = z = 0;
                    x++;
                }
                else if (z == array[x][y].length - 1) {
                    z = 0;
                    y++;
                }
                else {
                    z++;
                }
                return val;
            }
        };
    }
}