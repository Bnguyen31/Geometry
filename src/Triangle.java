public class Triangle extends Geom implements Comparable<Geom> {
    private double base, height, side1, side2;

    public Triangle(double base, double height, double side1, double side2) {
        this.base = base;
        this.height = height;
        this.side1 = side1;
        this.side2 = side2;
    }

    public double area() {
        return base * height * 1/2;
    }

    public double perimeter() {
        return side1 + side2 + base;
    }

    public int compareTo(Geom tobject) {
        if (this.area() > tobject.area()) {
            return 1;
        } else if (this.area() < tobject.area()) {
            return -1;
        } else {
            return 0;
        }
    }

    // Getters and setters
    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
