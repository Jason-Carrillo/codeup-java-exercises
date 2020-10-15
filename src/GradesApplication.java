import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {
    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Scanner scanner = new Scanner(System.in);
        boolean userCont = true;



        students.putIfAbsent("student1", new Student("Sam"));
        students.putIfAbsent("student2", new Student("Joe"));
        students.putIfAbsent("student3", new Student("Bill"));
        students.putIfAbsent("student4", new Student("Ted"));

        students.get("student1").addGrade(20);
        students.get("student1").addGrade(100);
        students.get("student1").addGrade(100);

        students.get("student1").recordAttendance("2017-10-02", "A");
        students.get("student1").recordAttendance("2017-10-02", "P");
        students.get("student1").recordAttendance("2017-10-02", "P");
        students.get("student1").recordAttendance("2017-10-02", "P");


        students.get("student2").addGrade(99);
        students.get("student2").addGrade(99);
        students.get("student2").addGrade(100);

        students.get("student2").recordAttendance("2017-10-02", "P");
        students.get("student2").recordAttendance("2017-10-02", "P");
        students.get("student2").recordAttendance("2017-10-02", "P");
        students.get("student2").recordAttendance("2017-10-02", "P");

        students.get("student3").addGrade(20);
        students.get("student3").addGrade(70);
        students.get("student3").addGrade(50);

        students.get("student3").recordAttendance("2017-10-02", "A");
        students.get("student3").recordAttendance("2017-10-02", "P");
        students.get("student3").recordAttendance("2017-10-02", "A");
        students.get("student3").recordAttendance("2017-10-02", "P");

        students.get("student4").addGrade(70);
        students.get("student4").addGrade(80);
        students.get("student4").addGrade(90);

        students.get("student4").recordAttendance("2017-10-02", "P");
        students.get("student4").recordAttendance("2017-10-02", "P");
        students.get("student4").recordAttendance("2017-10-02", "A");
        students.get("student4").recordAttendance("2017-10-02", "P");


        while(userCont){
            System.out.println("Please enter a student");
            System.out.println("Student1 = Sam");
            System.out.println("Student2 = Joe");
            System.out.println("Student3 = Bill");
            System.out.println("Student4 = Ted");
            String userInput = scanner.nextLine();

            if(userInput.contains("1")){
                System.out.print(students.get("student1").getName()+"'s grade average is: ");
                System.out.println(students.get("student1").getGradeAverage());

            } else if (userInput.contains("2")){
                System.out.print(students.get("student2").getName()+"'s grade average is: ");
                System.out.println(students.get("student2").getGradeAverage());

            } else if (userInput.contains("3")){
                System.out.print(students.get("student3").getName()+"'s grade average is: ");
                System.out.println(students.get("student3").getGradeAverage());
            } else if (userInput.contains("4")){
                System.out.print(students.get("student4").getName()+"'s grade average is: ");
                System.out.println(students.get("student4").getGradeAverage());
            } else {
                System.out.println("There is no student with these credentials registered");
            }

            System.out.println("Would you like to search for another student? y/n");
            String confirm = scanner.nextLine();
            if (!confirm.equalsIgnoreCase("y")){
                System.out.println("Thanks for checking :D");
                userCont = false;
            }
        }

    }

}
