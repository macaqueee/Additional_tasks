package week3.testequals;

public class ColorPoint extends Point {
    private Color color;

    public ColorPoint(int x, int y, Color color) {
        super(x, y);
        this.color = color;
    }

     public boolean equals(Object o) {
        if (super.equals(o)) {

            ColorPoint cp = (ColorPoint) o;
            if (cp.color.equals(color)){
                return true;
            }
        }
         return false;
    }
}
