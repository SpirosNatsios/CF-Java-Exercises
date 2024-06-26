package gr.aueb.cf.ch15;

public class Main {

    public static void main(String[] args) {
        Point p1 = new Point(3);
        Point2D p2 = new Point2D(3, 4);
        Point3D p3 = new Point3D(1, 2, 2);

        System.out.println("Distance of p1 from origin: " + PointUtil.distanceFromOrigin(p1));
        System.out.println("Distance of p2 from origin: " + PointUtil.distanceFromOrigin(p2));
        System.out.println("Distance of p3 from origin: " + PointUtil.distanceFromOrigin(p3));
    }
}
