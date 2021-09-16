package KeThua.Circle;

public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle();
        circle.setRadius(3);
        circle.setColor("Blue");
        System.out.println(circle);

        Cylinder cylinder = new Cylinder(circle.getRadius(), circle.getColor(), 7);
        System.out.println(cylinder);
    }
}
