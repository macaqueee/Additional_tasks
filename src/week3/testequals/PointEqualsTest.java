package week3.testequals;

/**
 * Created by 1 on 30.05.2016.
 */
public class PointEqualsTest {
    public static void main(String[] args) {
        /*System.out.println("Сравниваем обычную точку и цветную точку:");
        Point p1 = new Point(1, 2);
        ColorPoint cp = new ColorPoint(1, 2, Color.RED);
        System.out.println("p equals cp = " + p1.equals(cp));
        System.out.println("cp equals p = " + cp.equals(p1));*/

        ColorPoint p1 = new ColorPoint(1, 2, Color.RED);
        Point p2 = new Point(1, 2);
        ColorPoint p3 = new ColorPoint(1, 2, Color.BLUE);
        System.out.println("p1 equals p2 = " + p1.equals(p2));
        System.out.println("p2 equals p3 = " + p2.equals(p3));
        System.out.println("p1 equals p3 = " + p1.equals(p3));

    }
}
