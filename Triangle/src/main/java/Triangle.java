public class Triangle {

    private static Point a;
    private static Point b;
    private static Point c;
    private double sideAB = 0;
    private double sideBC = 0;
    private double sideCA = 0;

    public Triangle(){}

    public Triangle(Point a, Point b, Point c) {
        if ((b.getX() - a.getX())*(c.getY() - a.getY()) != (b.getY() - a.getY())*(c.getX() - a.getX())) {
            Triangle.a = a;
            Triangle.b = b;
            Triangle.c = c;
            sideAB = getSide(a, b);
            sideBC = getSide(b, c);
            sideCA = getSide(c, a);
        }
    }

    public double getSide(Point a, Point b) {
        return Math.pow(Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2), 0.5);
    }

    public double getSquare() {
        double p = (sideAB + sideCA + sideBC) / 2;
        return Math.pow(p*(p - sideBC)*(p - sideAB)*(p - sideCA), 0.5);
    }

    public boolean isIsosceles() {
        return sideAB != 0 && (sideAB == sideBC || sideBC == sideCA || sideCA == sideAB);
    }

    @Override
    public String toString() {
        return a.toString() + " " + b.toString() + " " + c.toString();
    }

    public static Point getA() {
        return a;
    }

    public static Point getB() {
        return b;
    }

    public static Point getC() {
        return c;
    }
}
