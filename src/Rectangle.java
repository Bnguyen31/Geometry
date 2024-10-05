public class Rectangle extends Geom implements Comparable<Geom> {
    private double width, height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double area() {
        return width * height;
    }

    public double perimeter() {
        return 2 * (width + height);
    }

    public int compareTo(Geom robject) {
        if (this.area() > robject.area()) {
            return 1;
        } else if (this.area() < robject.area()) {
            return -1;
        } else {
            return 0;
        }
    }

    // Getters and setters
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
