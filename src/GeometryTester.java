public class GeometryTester {
    public static void main(String[] args) {

        Geom t1 = new Triangle(5,5,5,5);
        Geom r1 = new Rectangle(8,6);
        Geom c1 = new Circle(30);

        Triangle t2 = new Triangle(30,14,3,3);
        Rectangle r2 = new Rectangle(30,8);
        Circle c2 = new Circle(50);



        System.out.println("Triangle 2 compared to Rectangle 2 is " + t2.compareTo(r2));
        System.out.println("Rectangle 2 compared to Rectangle 1 is " + r2.compareTo(c2));
        System.out.println("Rectangle 2 compared to Rectangle 1 is " + c2.compareTo(t2));
    }
}
