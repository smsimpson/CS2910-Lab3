import java.awt.Point;
import java.lang.Math;

public class EuclideanPoint extends Point implements Measurer<Point> {

    private int x;
    private int y;

    public EuclideanPoint(int a, int b) {
        x = a;
        y = b;
    }

    @Override
    public double measure(Point anObject) {
        return Math.sqrt(((x - anObject.getX())*(x - anObject.getX())) + ((y - anObject.getY())*(y - anObject.getY())));
    }
}
