import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grade = new ArrayList<>();

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
        return totalGrade/grade.size();
    }

}
