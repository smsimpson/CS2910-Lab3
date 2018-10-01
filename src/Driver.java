import java.awt.*;

public class Driver {

    public static void main(String[] args) {

        // create some points
        Point p0 = new Point (3, 4);
        Point p1 = new Point (4, 5);
        Point p2 = new Point (4, 2);
        Point p3 = new Point (-5, 1);

        EuclideanPoint op = new EuclideanPoint(0,0);

        Point[] pointArray = new Point[4];
        pointArray[0] = p0;
        pointArray[1] = p1;
        pointArray[2] = p2;
        pointArray[3] = p3;

        System.out.println(op.max(pointArray,op));
    }
}
