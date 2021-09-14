package AccessModifier.Circle;

public class Circle {
    private double radius = 1.0;
    private String color = "red";
    final float PI = 3.14f;
    public Circle() {
    }

    public Circle (double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return radius * radius * PI;
    }

    public String toString() {
        return "\nRadius is: " + getRadius() + "\nArea is: " + getArea();
    }
}
