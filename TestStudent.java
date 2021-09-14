package AccessModifier.Student;

public class TestStudent {
    public static void main(String[] args) {
        Student Student1 = new Student();
        Student1.setName("Hoàng");
        Student1.getName();
        Student1.setClasses("C5");
        Student1.getClasses();
        System.out.println(Student1.toString());
    }
}
