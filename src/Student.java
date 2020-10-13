import java.util.ArrayList;
import java.util.HashMap;

public class Student {
    private final String name;
    private final ArrayList<Integer> grade;
    private final HashMap<String, String> att;

    public static void main(String[] args) {
        Student Joe = new Student("Joe");

        Joe.addGrade(90);
        Joe.addGrade(70);
        Joe.addGrade(60);
        Joe.addGrade(100);
        Joe.addGrade(100);

        System.out.println(Joe.getName());
        System.out.println(Joe.grade);

        System.out.println(Joe.getGradeAverage());


    }

    public Student(String studentName){
        this.name = studentName;
        this.grade = new ArrayList<>();
        this.att = new HashMap<>();
    }

    public String getName(){
        return this.name;
    }

    public void addGrade(int grade){
        this.grade.add(grade);
    }

    public double getGradeAverage(){
        double totalGrade = 0;
        for (Integer number: grade){
             totalGrade += number;
        }

        double gradeAverage = totalGrade/grade.size();

        return Math.round(gradeAverage * 100)/100.0;
    }

    public void recordAttendance(String date, String value){
        this.att.put(date, value);
    }



}
