import java.util.HashMap;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        students.putIfAbsent("student1", new Student("Sam"));
        students.putIfAbsent("student2", new Student("Joe"));
        students.putIfAbsent("student3", new Student("Bill"));

        students.get("student1").addGrade(20);
        students.get("student1").addGrade(100);
        students.get("student1").addGrade(100);

        students.get("student2").addGrade(99);
        students.get("student2").addGrade(100);
        students.get("student2").addGrade(100);

        students.get("student3").addGrade(20);
        students.get("student3").addGrade(70);
        students.get("student3").addGrade(50);

        System.out.print(students.get("student1").getName()+"'s grade average is: ");
        System.out.println(students.get("student1").getGradeAverage());
        System.out.print(students.get("student2").getName()+"'s grade average is: ");
        System.out.println(students.get("student2").getGradeAverage());
        System.out.print(students.get("student3").getName()+"'s grade average is: ");
        System.out.println(students.get("student3").getGradeAverage());

    }
}
