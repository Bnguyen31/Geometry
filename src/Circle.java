public class Circle extends Geom implements Comparable<Geom> {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    public int compareTo(Geom cobject) {
        if (this.area() > cobject.area()) {
            return 1;
        } else if (this.area() < cobject.area()) {
            return -1;
        } else {
            return 0;
        }
    }

    // Getters and the setters for circle
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
}
