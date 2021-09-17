package CleanCodeAndRefactoring.Cylinder;

public class Cylinder {

    public static double getBaseArea;
    public static double getPerimeter;

    public static double getVolume(int radius, int height){
        getBaseArea = Math.PI * radius * radius;
        double baseArea = getBaseArea;
        double perimeter = 2 * Math.PI  * radius;
        getPerimeter = perimeter * height + 2 * baseArea;
        double volume = getPerimeter;
        return volume;
    }

    public static void main(String[] args) {
        System.out.println(getVolume(5, 6));
    }
}
