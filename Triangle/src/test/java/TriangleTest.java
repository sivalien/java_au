import org.junit.jupiter.api.Test;

import static junit.framework.TestCase.*;


class TriangleTest {
    Point a = new Point(0, 0);
    Point b, c, d, e;
    Triangle triangle1 = new Triangle(a, c = new Point(0, 10), new Point(10, 0));
    Triangle triangle2 = new Triangle(a, d = new Point(0, 3), e = new Point(4, 0));
    Triangle triangle3 = new Triangle(a, new Point(6, 0), new Point(6, 6));
    Triangle notTriangle1 = new Triangle(a, b = new Point(2, 2), new Point(3, 3));
    Triangle notTriangle2 = new Triangle(a, b, new Point(-2, -2));
    Triangle notTriangle3 = new Triangle(c, c, c);

    @Test
    void getSquare() {
        assertEquals(50.0, triangle1.getSquare());
        assertEquals(6.0, triangle2.getSquare());
        assertEquals(0.0, notTriangle1.getSquare());
        assertEquals(0.0, notTriangle2.getSquare());
        assertEquals(0.0, notTriangle3.getSquare());
    }

    @Test
    void isIsosceles() {
        assertTrue(triangle1.isIsosceles());
        assertTrue(triangle3.isIsosceles());
        assertFalse(triangle2.isIsosceles());
        assertFalse(notTriangle1.isIsosceles());
        assertFalse(notTriangle3.isIsosceles());
    }

}